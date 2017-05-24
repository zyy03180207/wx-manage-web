package com.program.wxmanage.controller;

import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.program.wxmanage.BaseController;
import com.program.wxmanage.Global;
import com.program.wxmanage.param.AjaxResult;
import com.program.wxmanage.service.RemoteApiService;
import com.program.wxmanage.util.Menu;
import com.program.wxmanage.util.MenuUtil;
import com.program.wxmanage.util.StringUtil;

import microservice.api.ServiceApiHelper;
import microservice.api.ServiceResult;

@Controller
@RequestMapping(value = "/author")
public class AuthorController extends BaseController {

	@Autowired
	RemoteApiService remoteApiService;
	
	@RequestMapping(value = "authorAdd", method = RequestMethod.POST)
	public void authorAddPost(HttpServletRequest request, HttpServletResponse response) {
		AjaxResult ajaxResult = new AjaxResult();
		String title = getPara(request, "name");
		String pid = getPara(request, "author");
		String des = getPara(request, "des");
		String icon = getPara(request, "icon");
		String action = getPara(request, "uri");
		String ismenu = getPara(request, "switch");
		if(StringUtil.isEmpty(title)) {
			ajaxResult.setMesg("请输入名称");
			this.write(response, ajaxResult);
			return;
		}
		if(StringUtil.isEmpty(des)) {
			ajaxResult.setMesg("请输入权限描述");
			this.write(response, ajaxResult);
			return;
		}
		if(StringUtil.isEmpty(action)) {
			ajaxResult.setMesg("请输入权限连接");
			this.write(response, ajaxResult);
			return;
		}
		if(!StringUtil.isEmpty(ismenu) && ismenu.equals("on")) {
			ismenu = "1";
		} else {
			ismenu = "0";
		}
		JSONObject object = new JSONObject();
		object.put("pid", pid);
		object.put("title", title);
		object.put("des", des);
		object.put("icon", icon);
		object.put("ismenu", ismenu);
		object.put("action", action);
		String json = ServiceApiHelper.formatParam("tb_add_author", object.toJSONString(), Global.KEY);
		String resultStr = remoteApiService.getWXAip().execute(json);
		ServiceResult result = ServiceApiHelper.parseResult(resultStr);
		if(result.isSucc()) {
			ajaxResult.setMesg(result.getMesg());
			ajaxResult.setSucc(result.isSucc());
			this.write(response, ajaxResult);
			return;
		} else {
			ajaxResult.setSucc(false);
			ajaxResult.setMesg(result.getMesg());
			this.write(response, ajaxResult);
			return;
		}
	}
	
	@RequestMapping(value = "authorAdd", method = RequestMethod.GET)
	public ModelAndView authorAdd(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("authoradd");
		String c = request.getParameter("child");
		if(!StringUtil.isEmpty(c)) {
			andView.addObject("child", Integer.valueOf(c));
		} else {
			andView.addObject("child", -2);
		}
		JSONObject object = new JSONObject();
		String json = ServiceApiHelper.formatParam("tb_authorlist", object.toJSONString(), Global.KEY);
		String resultStr = remoteApiService.getWXAip().execute(json);
		ServiceResult result = ServiceApiHelper.parseResult(resultStr);
		LinkedList<Menu> linkedList = new LinkedList<Menu>();
		if(result.isSucc()){
			String data = result.getData();
			JSONObject resData = JSONObject.parseObject(data);
			JSONArray array = resData.getJSONArray("list");
			linkedList = MenuUtil.paresMenuList(array, 0, 0);
			andView.addObject("menus", linkedList);
		} else {
			andView.addObject("menus", linkedList);
		}
		return andView;
	}
	
	@RequestMapping(value = "authorList", method = RequestMethod.POST)
	public @ResponseBody String fansListPost(HttpServletRequest request, HttpServletResponse response) {
		String pageIndex = getPara(request, "pageIndex");
		String pageSize = getPara(request, "pageSize");
		JSONObject object = new JSONObject();
		object.put("pageIndex", pageIndex);
		object.put("pageSize", pageSize);
		String json = ServiceApiHelper.formatParam("tb_authorlist", object.toJSONString(), Global.KEY);
		String resultStr = remoteApiService.getWXAip().execute(json);
		ServiceResult result = ServiceApiHelper.parseResult(resultStr);
		JSONObject resJson = new JSONObject();
		resJson.put("code", 0);
		if(result.isSucc()){
			String data = result.getData();
			JSONObject resData = JSONObject.parseObject(data);
			resJson.put("msg", result.getMesg());
			resJson.put("list", resData.get("list"));
			resJson.put("count", resData.get("count"));
		} else {
			resJson.put("msg", result.getMesg());
			resJson.put("list", new JSONArray());
			resJson.put("count", 0);
		}
		return StringUtil.utfToIso(resJson.toJSONString());
	}
	
	public ModelAndView createMV(String jsp) {
		ModelAndView mv = new ModelAndView(""+jsp);
		return mv;
	}
}
