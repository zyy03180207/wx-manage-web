package com.program.wxmanage.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import microservice.online.entity.TbAdminUser;
import microservice.online.entity.TbFans;

@Controller
@RequestMapping("/")
public class IndexController extends BaseController {
	
	@Autowired
	RemoteApiService remoteApiService;
	
	@RequestMapping(value = "randCode")
	public void randCode(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		String s = generateCode(4);
		BufferedImage image = generateImage(s);
		session.setAttribute(V_CODE, s);
		response.setContentType("image/jpeg");
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		try {
			ServletOutputStream sos = response.getOutputStream();
			ImageIO.write((BufferedImage) image, "JPEG", sos);  
			sos.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "outLogin",method = RequestMethod.GET)
	public ModelAndView outLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("login");
		this.getSession(request).removeAttribute(Global.USER_INFO);
		this.getSession(request).removeAttribute(Global.SECQURITIES);
		return andView;
	}
	
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("login");
		this.getSession(request).removeAttribute(Global.MENUS);
		this.getSession(request).removeAttribute(Global.SECQURITIES);
		this.getSession(request).removeAttribute(Global.USER_INFO);
		return andView;
	}
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public void toLogin(HttpServletRequest request, HttpServletResponse response) {
		AjaxResult ajaxResult = new AjaxResult();
		String user = getPara(request, "username");
		String pass = getPara(request, "password");
		String vcode = getPara(request, "vcode");
		if(StringUtil.isEmpty(user)) {
			ajaxResult.setMesg("请输入用户名");
			this.write(response, ajaxResult);
			return;
		}
		if(StringUtil.isEmpty(pass)) {
			ajaxResult.setMesg("请输入密码");
			this.write(response, ajaxResult);
			return;
		}
		if(StringUtil.isEmpty(vcode)) {
			ajaxResult.setMesg("请输入验证码");
			this.write(response, ajaxResult);
			return;
		}
		String code = (String) this.getSession(request, V_CODE);
		if(!vcode.equalsIgnoreCase(code)) {
			ajaxResult.setMesg("验证码不正确");
			this.write(response, ajaxResult);
			return;
		}
		String md5Pass = md5(pass);
		JSONObject object = new JSONObject();
		object.put("username", user);
		object.put("password", md5Pass);
		object.put("vcode", vcode);
		String json = ServiceApiHelper.formatParam("tb_login", object.toJSONString(), Global.KEY);
		String resultStr = remoteApiService.getWXAip().execute(json);
		ServiceResult result = ServiceApiHelper.parseResult(resultStr);
		//判断登陆结果
		if(result.isSucc()) {
			JSONObject dataJson = JSONObject.parseObject(result.getData());
			JSONObject adminJson = dataJson.getJSONObject("adminUser");
			this.setSession(request, Global.USER_INFO, adminJson);
			ajaxResult.setMesg(result.getMesg());
			ajaxResult.setSucc(true);
			this.write(response, ajaxResult);
			return;
		} else {
			ajaxResult.setMesg(result.getMesg());
			this.write(response, ajaxResult);
			return;
		}
	}
	
	@RequestMapping(value = "index",method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("index");
		JSONObject jsonObject = (JSONObject) this.getSession(request, Global.USER_INFO);
		TbAdminUser adminUser = JSONObject.parseObject(jsonObject.toJSONString(), TbAdminUser.class);
		andView.addObject("adminUser", adminUser);
		JSONArray array = new JSONArray();
		JSONObject object = new JSONObject();
		object.put("title", "粉丝管理");
		object.put("icon", "fa-user-secret");
		object.put("spread", false);
		object.put("href", "#");
		JSONArray childrenArray1 = new JSONArray();
		JSONObject object2 = new JSONObject();
		object2.put("title", "粉丝列表");
		object2.put("href", "fansList");
		childrenArray1.add(object2);
		object.put("children", childrenArray1);
		array.add(object);
		andView.addObject("menu", array);
		return andView;
	}
	
	@RequestMapping(value = "fansList", method = RequestMethod.GET)
	public ModelAndView fansList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("fanslist");
		return andView;
	}
	
	@RequestMapping(value = "delFansList",method = RequestMethod.GET)
	public ModelAndView delFansList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("delfanslist");
		return andView;
	}
	
	@RequestMapping(value = "main",method = RequestMethod.GET)
	public ModelAndView memberlist(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("main");
		return andView;
	}
	
	@RequestMapping(value = "adminRole",method = RequestMethod.GET)
	public ModelAndView adminRole(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("adminrole");
		return andView;
	}
	
	@RequestMapping(value = "adminAuthor",method = RequestMethod.GET)
	public ModelAndView adminAuthor(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("adminauthor");
		return andView;
	}
	
	@RequestMapping(value = "error404",method = RequestMethod.GET)
	public ModelAndView error404(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("404");
		return andView;
	}
	
	@RequestMapping(value = "error500",method = RequestMethod.GET)
	public ModelAndView error500(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("500");
		return andView;
	}
	
	@RequestMapping(value = "adminList",method = RequestMethod.GET)
	public ModelAndView adminList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("adminlist");
		return andView;
	}
	
	public ModelAndView createMV(String jsp) {
		ModelAndView mv = new ModelAndView(""+jsp);
		return mv;
	}
}
