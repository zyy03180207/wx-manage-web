package com.program.wxmanage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.program.wxmanage.BaseController;
import com.program.wxmanage.param.AjaxResult;

@Controller
@RequestMapping(value = "/author")
public class AuthorController extends BaseController {

	@RequestMapping(value = "authorAdd", method = RequestMethod.POST)
	public void authorAddPost(HttpServletRequest request, HttpServletResponse response) {
		AjaxResult ajaxResult = new AjaxResult();
	}
	
	@RequestMapping(value = "authorAdd", method = RequestMethod.GET)
	public ModelAndView authorAdd(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView andView = createMV("authoradd");
		return andView;
	}
	
	public ModelAndView createMV(String jsp) {
		ModelAndView mv = new ModelAndView(""+jsp);
		return mv;
	}
}
