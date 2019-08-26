package com.example.final_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/home", "/thymeleafmerge/thymeleafExtend.html"})
    public void action(){
    }
}