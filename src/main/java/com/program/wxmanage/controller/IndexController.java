package com.program.wxmanage.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
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

import com.alibaba.fastjson.JSONObject;
import com.program.wxmanage.BaseController;
import com.program.wxmanage.Global;
import com.program.wxmanage.param.AjaxResult;
import com.program.wxmanage.service.RemoteApiService;
import com.program.wxmanage.util.StringUtil;

import microservice.api.ServiceApiHelper;
import microservice.api.ServiceResult;
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
	
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("login");
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
	
	@RequestMapping(value = "welcome",method = RequestMethod.GET)
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("welcome");
		return andView;
	}
	
	@RequestMapping(value = "index",method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("index");
		return andView;
	}
	
	@RequestMapping(value = "fansList", method = RequestMethod.GET)
	public ModelAndView fansList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("fans-list");
		JSONObject object = new JSONObject();
		String json = ServiceApiHelper.formatParam("tb_fanslist", object.toJSONString(), Global.KEY);
		String resultStr = remoteApiService.getWXAip().execute(json);
		ServiceResult result = ServiceApiHelper.parseResult(resultStr);
		if(result.isSucc()){
			String data = result.getData();
			List<TbFans> tbFans = JSONObject.parseArray(data, TbFans.class);
			andView.addObject("fans", tbFans);
		} else {
			andView.addObject("fans", new ArrayList<TbFans>());
		}
		return andView;
	}
	
	@RequestMapping(value = "memberlist",method = RequestMethod.GET)
	public ModelAndView memberlist(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("member-list");
		return andView;
	}
	
	@RequestMapping(value = "memberdel",method = RequestMethod.GET)
	public ModelAndView memberdel(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("member-del");
		return andView;
	}
	
	@RequestMapping(value = "feedbacklist",method = RequestMethod.GET)
	public ModelAndView feedbacklist(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("feedback-list");
		return andView;
	}
	
	@RequestMapping(value = "articlelist",method = RequestMethod.GET)
	public ModelAndView articlelist(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("article-list");
		return andView;
	}
	
	@RequestMapping(value = "adminrole",method = RequestMethod.GET)
	public ModelAndView adminrole(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("admin-role");
		return andView;
	}
	
	@RequestMapping(value = "adminpermission",method = RequestMethod.GET)
	public ModelAndView adminpermission(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("admin-permission");
		return andView;
	}
	
	@RequestMapping(value = "adminlist",method = RequestMethod.GET)
	public ModelAndView adminlist(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("admin-list");
		return andView;
	}
	
	@RequestMapping(value = "systembase",method = RequestMethod.GET)
	public ModelAndView systembase(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("system-base");
		return andView;
	}
	
	@RequestMapping(value = "systemcategory",method = RequestMethod.GET)
	public ModelAndView systemcategory(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("system-category");
		return andView;
	}
	
	@RequestMapping(value = "systemdata",method = RequestMethod.GET)
	public ModelAndView systemdata(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("system-data");
		return andView;
	}
	
	@RequestMapping(value = "systemlog",method = RequestMethod.GET)
	public ModelAndView systemlog(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("system-log");
		return andView;
	}
	
	@RequestMapping(value = "systemshielding",method = RequestMethod.GET)
	public ModelAndView systemshielding(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("system-shielding");
		return andView;
	}
	
	@RequestMapping(value = "charts1",method = RequestMethod.GET)
	public ModelAndView charts1(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("charts-1");
		return andView;
	}
	
	@RequestMapping(value = "charts2",method = RequestMethod.GET)
	public ModelAndView charts2(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("charts-2");
		return andView;
	}
	
	@RequestMapping(value = "charts3",method = RequestMethod.GET)
	public ModelAndView charts3(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("charts-3");
		return andView;
	}
	
	@RequestMapping(value = "charts4",method = RequestMethod.GET)
	public ModelAndView charts4(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("charts-4");
		return andView;
	}
	
	@RequestMapping(value = "charts5",method = RequestMethod.GET)
	public ModelAndView charts5(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("charts-5");
		return andView;
	}
	
	@RequestMapping(value = "charts6",method = RequestMethod.GET)
	public ModelAndView charts6(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("charts-6");
		return andView;
	}
	
	@RequestMapping(value = "charts7",method = RequestMethod.GET)
	public ModelAndView charts7(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("charts-7");
		return andView;
	}
	
	public ModelAndView createMV(String jsp) {
		ModelAndView mv = new ModelAndView(""+jsp);
		return mv;
	}
}
