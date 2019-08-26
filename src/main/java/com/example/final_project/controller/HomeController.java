package com.example.dog_chain.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/home/{action}")
	public String actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelandView) {
      
        return "/home/" + action;
	
	}
}
