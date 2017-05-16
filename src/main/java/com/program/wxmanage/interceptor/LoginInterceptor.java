package com.program.wxmanage.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.program.wxmanage.Global;
import com.program.wxmanage.service.RemoteApiService;
import com.program.wxmanage.util.MenuUtil;

import microservice.api.ServiceApiHelper;
import microservice.api.ServiceResult;

public class LoginInterceptor implements HandlerInterceptor {

	@Autowired
	RemoteApiService remoteApiService;

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		String url = request.getRequestURI();
		HttpSession session = request.getSession();
		JSONObject userJson = (JSONObject) session.getAttribute(Global.USER_INFO);
		JSONArray secqs = (JSONArray) session.getAttribute(Global.SECQURITIES);
		//是否登录验证,先判断是不是login请求，然后在判断是否登录过
		if(url.indexOf("login") >= 0) {
			return true;
		}
		if(userJson == null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		}
		if(secqs == null) {
			JSONObject object = new JSONObject();
			object.put("username", userJson.get("username"));
			String json = ServiceApiHelper.formatParam("tb_authorlist", object.toJSONString(), Global.KEY);
			String resultStr = remoteApiService.getWXAip().execute(json);
			ServiceResult result = ServiceApiHelper.parseResult(resultStr);
			if(result.isSucc()) {
				String data = result.getData();
				JSONObject dataJson = JSONObject.parseObject(data);
				JSONArray array = dataJson.getJSONArray("list");
				secqs = MenuUtil.paresMenu(array, 0);
			} else {
				secqs = new JSONArray();
			}
			session.setAttribute(Global.SECQURITIES, secqs);
		}
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
