package com.example.final_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CalendarController {
    @RequestMapping(value = { "/main/index.html" })
    public void action() {
    }
}