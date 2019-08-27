package com.example.final_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    @RequestMapping(value = { "/thymeleafmerge/thymeleafExtend.html" })
    public void action() {
    }

    @RequestMapping(value = "/")
    public String index() {
        return "login";
    }

    @RequestMapping(value = { "/login/*", "/layout/* "})
    public void test() {
    }

    //강의신청, 내강의
    @RequestMapping(value = { "/enrolment"})
    public void enrolment() {        
    }

    @RequestMapping(value = { "/mylesson"})
    public void mylesson() {        
    }
}