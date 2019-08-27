package com.example.final_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    @RequestMapping(value = { "/index", "/thymeleafmerge/thymeleafExtend.html" })
    public void action() {
    }

    @RequestMapping(value = { "/login/*", "/layout/*" })
    public void test() {
    }
}