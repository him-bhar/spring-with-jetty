package com.himanshu.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class TestSimpleController extends AbstractController {
	
	private String success;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("This is handleRequestInternal");
		ModelAndView mv = new ModelAndView(getSuccess());
		mv.addObject("message", "HOLAAAAAAAAAA");
		return mv;
	}

}
