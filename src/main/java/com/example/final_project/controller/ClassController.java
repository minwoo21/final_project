package com.example.final_project.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.final_project.service.ClassService;
import com.example.final_project.service.HwService;

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
	@Autowired
    private HwService service2;
    
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
		}else if("notice_detail".equals(action)){
			resultMap = service.getObject(paramMap);
			action = "notice_detail";
		}else if ("introduction".equals(action)) {

		} else if ("homework".equals(action)) {
			resultMap = service2.getList(paramMap);
			action = "homework";
		}else if ("make".equals(action)) {
			resultMap = service2.saveObject(paramMap);
			action = "homework";
		}else if ("hwdetail".equals(action)) {
			resultMap = service2.getObject(paramMap);
			action = "hwdetail";
		}

		String viewName = MAPPING + action;

		modelandView.setViewName(viewName);

		modelandView.addObject("paramMap", paramMap);
		modelandView.addObject("resultMap", resultMap);
		return modelandView;
	}
}