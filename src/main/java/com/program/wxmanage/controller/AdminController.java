package com.program.wxmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.program.wxmanage.BaseController;

@Controller
@RequestMapping(value = "/admin")
public class AdminController extends BaseController {

	@RequestMapping(value = "adminadd", method = RequestMethod.GET)
	public ModelAndView adminadd() {
		ModelAndView andView = createMV("admin-add");
		return andView;
	}
	
	public ModelAndView createMV(String jsp) {
		ModelAndView mv = new ModelAndView(""+jsp);
		return mv;
	}
}
