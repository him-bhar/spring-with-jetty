package com.himanshu.spring.mvc.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestAjaxController {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/ajax.htm")
	public @ResponseBody HashMap<String, Object> fireAjaxRequest (@RequestParam String name) {
		System.out.println("Inside fire ajax request");
		System.out.println("NAME IS: "+name);
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("name", "HBK");
		return result;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/ajax2.htm")
	public @ResponseBody HashMap<String, Object> fireAjax2Request (@RequestParam String name) {
		System.out.println("Inside fire ajax request");
		System.out.println("NAME IS: "+name);
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("name", "HBK");
		return result;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/ajax.htm")
	public String getAjaxPage () {
		//ModelAndView result = new ModelAndView();
		//result.setView(view)
		//result.addObject("name", "HBK");
		return "TestAjax";
	}
	
	//Referencing another way to send JSON.
	@RequestMapping(value = "/ajax2.htm", method = RequestMethod.GET)
	protected void getJsonDataExample(HttpServletResponse response) {
	    MappingJacksonHttpMessageConverter jsonConverter = new MappingJacksonHttpMessageConverter();
	    MediaType jsonMimeType = MediaType.APPLICATION_JSON;
	    //Object jsonBean = new String("mock for the json object which have to be replaced with real one");
	    HashMap<String, Object> jsonBean = new HashMap<String, Object>();
	    jsonBean.put("name", "HBK");
	    if (jsonConverter.canWrite(jsonBean.getClass(), jsonMimeType)) {
	        try {
	            jsonConverter.write(jsonBean, jsonMimeType, new ServletServerHttpResponse(response));
	        } catch (IOException m_Ioe) {
	        } catch (HttpMessageNotWritableException p_Nwe) {
	        }
	    }
	}	
}
