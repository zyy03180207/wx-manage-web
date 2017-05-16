package com.program.wxmanage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
@RequestMapping(value = "/admin")
public class AdminController extends BaseController {

	@Autowired
	RemoteApiService remoteApiService;
	
	@RequestMapping(value = "adminAdd", method = RequestMethod.POST)
	public void adminadd(HttpServletRequest request, HttpServletResponse response) {
		AjaxResult ajaxResult = new AjaxResult();
		String username = getPara(request, "username");
		String password = getPara(request, "password");
		String phone = getPara(request, "phone");
		String email = getPara(request, "email");
		String roleId = getPara(request, "role");
		String state = getPara(request, "switch");
		if(StringUtil.isEmpty(username)) {
			ajaxResult.setMesg("请输入登录名");
			this.write(response, ajaxResult);
			return;
		}
		if(StringUtil.isEmpty(password)) {
			ajaxResult.setMesg("请输入登录密码");
			this.write(response, ajaxResult);
			return;
		}
		if(StringUtil.isEmpty(phone)) {
			ajaxResult.setMesg("请输入手机号");
			this.write(response, ajaxResult);
			return;
		}
		if(StringUtil.isEmpty(email)) {
			ajaxResult.setMesg("请输入邮箱");
			this.write(response, ajaxResult);
			return;
		}
		if(StringUtil.isEmpty(roleId) && roleId.equals("0")) {
			ajaxResult.setMesg("请选择用户角色");
			this.write(response, ajaxResult);
			return;
		}
		if(StringUtil.isEmpty(state)) {
			state = "0";
		} else {
			state = "1";
		}
		JSONObject object = new JSONObject();
		object.put("username", username);
		object.put("password", md5(password));
		object.put("phone", phone);
		object.put("email", email);
		object.put("roleId", roleId);
		object.put("state", state);
		String json = ServiceApiHelper.formatParam("tb_add_admin", object.toJSONString(), Global.KEY);
		String resultStr = remoteApiService.getWXAip().execute(json);
		ServiceResult result = ServiceApiHelper.parseResult(resultStr);
		if(result.isSucc()) {
			ajaxResult.setSucc(true);
			ajaxResult.setMesg(result.getMesg());
			this.write(response, ajaxResult);
			return;
		} else {
			ajaxResult.setSucc(false);
			ajaxResult.setMesg(result.getMesg());
			this.write(response, ajaxResult);
			return;
		}
	}
	
	@RequestMapping(value = "adminAdd", method = RequestMethod.GET)
	public ModelAndView adminAdd() {
		ModelAndView andView = createMV("adminadd");
		JSONObject object = new JSONObject();
		String json = ServiceApiHelper.formatParam("tb_rolelist", object.toJSONString(), Global.KEY);
		String resultStr = remoteApiService.getWXAip().execute(json);
		ServiceResult result = ServiceApiHelper.parseResult(resultStr);
		if(result.isSucc()) {
			JSONObject jsonObject = JSONObject.parseObject(result.getData());
			JSONArray array = jsonObject.getJSONArray("list");
			List<TbRole> roles = JSONArray.parseArray(array.toJSONString(), TbRole.class);
			andView.addObject("roles", roles);
		} else {
			andView.addObject("role", null);
		}
		return andView;
	}
	
	@RequestMapping(value = "adminList", method = RequestMethod.POST)
	public @ResponseBody String adminList(HttpServletRequest request, HttpServletResponse response) {
		String pageIndex = getPara(request, "pageIndex");
		String pageSize = getPara(request, "pageSize");
		JSONObject object = new JSONObject();
		object.put("pageIndex", pageIndex);
		object.put("pageSize", pageSize);
		String json = ServiceApiHelper.formatParam("tb_adminlist", object.toJSONString(), Global.KEY);
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
