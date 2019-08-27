package com.example.final_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@Controller
public class lessoncontroller {
    @RequestMapping(value = {"/enrolment"})
    public void enrolment() { }

    @RequestMapping(value = {"/mylesson"})
    public void mylesson() { }
}