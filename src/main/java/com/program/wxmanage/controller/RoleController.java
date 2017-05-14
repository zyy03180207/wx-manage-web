package com.program.wxmanage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.program.wxmanage.BaseController;
import com.program.wxmanage.Global;
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
	
}
