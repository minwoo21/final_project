package com.example.final_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = { "/class" })
public class ClassController {
    @RequestMapping(value = { "/main" })
    public void action() {
    }
    @RequestMapping(value = { "/notice" })
    public void notice() {
    }
    @RequestMapping(value = { "/introduction" })
    public void introduction() {
    }
    @RequestMapping(value = { "/homework" })
    public void homework() {
    }
    @RequestMapping(value = { "/hw_submit" })
    public void hw_submit() {
    }
}