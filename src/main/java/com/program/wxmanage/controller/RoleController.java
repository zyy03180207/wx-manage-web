package com.program.wxmanage.controller;

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
import com.program.wxmanage.util.StringUtil;

import microservice.api.ServiceApiHelper;
import microservice.api.ServiceResult;
import microservice.online.entity.TbRole;

@Controller
@RequestMapping(value = "/role")
public class RoleController extends BaseController {

	@Autowired
	RemoteApiService remoteApiService;
	
	@RequestMapping(value = "roleList", method = RequestMethod.POST)
	public @ResponseBody String roleList(HttpServletRequest request, HttpServletResponse response) {
		String pageIndex = getPara(request, "pageIndex");
		String pageSize = getPara(request, "pageSize");
		JSONObject object = new JSONObject();
		object.put("pageIndex", pageIndex);
		object.put("pageSize", pageSize);
		String json = ServiceApiHelper.formatParam("tb_rolelist", object.toJSONString(), Global.KEY);
		String resultStr = remoteApiService.getWXAip().execute(json);
		ServiceResult result = ServiceApiHelper.parseResult(resultStr);
		JSONObject resJson = new JSONObject();
		resJson.put("code", 0);
		if(result.isSucc()) {
			JSONObject jsonObject = JSONObject.parseObject(result.getData());
			resJson.put("list", jsonObject.get("list"));
			resJson.put("count", jsonObject.get("count"));
			resJson.put("msg", result.getMesg());
		} else {
			resJson.put("msg", result.getMesg());
			resJson.put("list", new JSONArray());
			resJson.put("count", 0);
		}
		return StringUtil.utfToIso(resJson.toJSONString());
	}
	
	@RequestMapping(value = "roleToAuthor", method = RequestMethod.GET)
	public ModelAndView roleToAuthor(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("roletoauthor");
		return andView;
	}
	
	@RequestMapping(value = "roleAdd", method = RequestMethod.GET)
	public ModelAndView roleAdd(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("roleadd");
		return andView;
	}
	
	@RequestMapping(value = "roleAdd", method = RequestMethod.POST)
	public void roleAddPost(HttpServletRequest request, HttpServletResponse response) {
		AjaxResult ajaxResult = new AjaxResult();
		String name = getPara(request, "name");
		String introduce = getPara(request, "introduce");
		String state = getPara(request, "state");
		if(StringUtil.isEmpty(name)) {
			ajaxResult.setMesg("请输入角色名称");
			this.write(response, ajaxResult);
			return;
		}
		if(StringUtil.isEmpty(introduce)) {
			ajaxResult.setMesg("请输入角色描述");
			this.write(response, ajaxResult);
			return;
		}
		if(StringUtil.isEmpty(state)) {
			state = "0";
		} else {
			state = "1";
		}
		JSONObject object = new JSONObject();
		object.put("name", name);
		object.put("introduce", introduce);
		object.put("state", state);
		String json = ServiceApiHelper.formatParam("tb_add_role", object.toJSONString(), Global.KEY);
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
	
	public ModelAndView createMV(String jsp) {
		ModelAndView mv = new ModelAndView(""+jsp);
		return mv;
	}
}
