package com.example.final_project.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.final_project.service.ClassService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClassController {

    private final static String MAPPING = "/class/";

    @Autowired
    private ClassService service;
    
    @RequestMapping(value = MAPPING+"{action}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView) {

		Object resultMap = new HashMap<String, Object>() ;

		// divided depending on action value
		if ("main".equals(action)) {
			resultMap = service.getObject(paramMap);
		} else if ("notice".equals(action)) {
            resultMap = service.getList(paramMap);
            action = "notice";
		} else if ("update".equals(action)) {
			resultMap = service.updateObject(paramMap);
			action = "read";
		} else if ("introduction".equals(action)) {
			resultMap = service.saveObject(paramMap);
			action = "read";
		} else if ("homework".equals(action)) {
			resultMap = service.saveObject(paramMap);
			action = "read";
		} 

		String viewName = MAPPING + action;

		modelandView.setViewName(viewName);

		modelandView.addObject("paramMap", paramMap);
		modelandView.addObject("resultMap", resultMap);
		return modelandView;
	}
}