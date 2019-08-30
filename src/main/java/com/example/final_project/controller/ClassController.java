package com.example.final_project.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.final_project.service.ClassService;
import com.example.final_project.service.HwService;
import com.example.final_project.service.MemberService;
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
	private MemberService memberservice;

	@RequestMapping(value = MAPPING + "{action}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView) {

		Object resultMap = new HashMap<String, Object>();
		String type = (String) memberservice.getMemberInfo(paramMap).get("MEMBERTYPE");

		// divided depending on action value
		if ("main".equals(action)) {
			resultMap = lesson.getObject(paramMap);
			action = "/main";
		} else if ("notice".equals(action)) {
			resultMap = classService.getnoticeList(paramMap);
			action = "/notice";
		} else if ("notice_detail".equals(action)) {
			resultMap = classService.getnoticeObject(paramMap);
			action = "/notice_detail";
		} else if ("introduction".equals(action)) {
			action = "/introduction";
		} else if ("homework".equals(action)) {
			resultMap = hwService.getList(paramMap);
			action = "/homework";
		} else if ("make".equals(action)) { // 과제 추가 버튼
			resultMap = hwService.saveObject(paramMap);
			action = "/homework";
		} else if ("hwdetail".equals(action)) {
			resultMap = hwService.getObject(paramMap);
			action = "/hwdetail";
		} else if ("main_pro".equals(action)) {
			action = "/main_pro";
		} else if ("hw_submit".equals(action)) { // 과제 추가창
			action = "/hw_submit";
			paramMap.put("MEMBER_NAME", memberservice.getMemberInfo(paramMap).get("NAME"));
		} else if ("hw_submit".equals(action)) {
			action = "/hw_submit";
		} else if ("addform".equals(action)) {
			action = "/addform";
		} else if ("addnotice".equals(action)) {
			resultMap = classService.saveObject(paramMap);
			action = "/notice";
		} else if ("member".equals(action)) {
			resultMap = classService.getmember(paramMap);
			action = "/member";
		} else if ("submit".equals(action)) {
			paramMap.put("MEMBER_NAME", memberservice.getMemberInfo(paramMap).get("USERNAME"));

			resultMap = hwService.submitObject(paramMap);
			action = "/homework";
		} else if ("hwcheck".equals(action)) {
			resultMap = hwService.getmember(paramMap);
			action = "/hwcheck";
		} else if ("notice_check".equals(action)) {
			resultMap = classService.getnoticeObject(paramMap);
			action = "/notice_check";
		}

		String viewName = MAPPING + type + action;

		modelandView = memberservice.checkLogin(paramMap, viewName);
		modelandView.addObject("sidebar", "show");
		modelandView.addObject("LESSON_NUM", paramMap.get("LESSON_NUM"));
		modelandView.addObject("paramMap", paramMap);
		modelandView.addObject("resultMap", resultMap);
		return modelandView;
	}
}