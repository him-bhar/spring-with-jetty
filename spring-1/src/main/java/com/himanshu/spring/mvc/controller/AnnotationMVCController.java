package com.himanshu.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/annotate")
public class AnnotationMVCController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView method1() {
		System.out.println("Inside method 1 for annotation");
		return new ModelAndView();
	}

}
