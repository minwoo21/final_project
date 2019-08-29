package com.example.final_project.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.final_project.service.ClassService;
import com.example.final_project.service.HwService;
import com.example.final_project.service.LoginService;
import com.example.final_project.service.lessonservice;

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
	private ClassService classService;
	@Autowired
	private HwService hwService;
	@Autowired
    private lessonservice lesson;
	@Autowired
	private LoginService loginservice;
	
    @RequestMapping(value = MAPPING+"{action}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView) {

		Object resultMap = new HashMap<String, Object>() ;

		// divided depending on action value
		if ("main".equals(action)) {
			resultMap = lesson.getObject(paramMap);
		} else if ("notice".equals(action)) {
            resultMap = classService.getnoticeList(paramMap);
            action = "notice";
		}else if("notice_detail".equals(action)){
			resultMap = classService.getnoticeObject(paramMap);
			action = "notice_detail";
		}else if ("introduction".equals(action)) {

		} else if ("homework".equals(action)) {
			resultMap = hwService.getList(paramMap);
			action = "homework";
		}else if ("make".equals(action)) {
			resultMap = hwService.saveObject(paramMap);
			action = "homework";
		}else if ("hwdetail".equals(action)) {
			resultMap = hwService.getObject(paramMap);
			action = "hwdetail";
		}else if ("main_pro".equals(action)) {
			action = "main_pro";
		}else if ("test".equals(action)) {
			action = "test";
		}

		String viewName = MAPPING + action;
		modelandView = loginservice.checkLogin(paramMap, viewName);
		modelandView.addObject("paramMap", paramMap);
		modelandView.addObject("resultMap", resultMap);
		return modelandView;
	}
}