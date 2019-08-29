package com.example.final_project.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.final_project.service.lessonservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class lessoncontroller {

    private final static String MAPPING = "/lesson/";

    @Autowired
    private lessonservice service;
    
    @RequestMapping(value = MAPPING+"{action}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView) {

		Object resultMap = new HashMap<String, Object>() ;

		// divided depending on action value
		if ("enrolment_action".equals(action)) {
            resultMap = service.getList(paramMap);
            action = "enrolment";
		} else if ("mylesson_action".equals(action)) {
            resultMap = service.getList(paramMap);
            action = "mylesson";
		} else if ("makelesson_action".equals(action)) {
            resultMap = service.getObject(paramMap);
            action = "makelesson";
        } 
		 
        
		String viewName = MAPPING + action;

		modelandView.setViewName(viewName);

		modelandView.addObject("paramMap", paramMap);
		modelandView.addObject("resultMap", resultMap);
		return modelandView;
	}
}