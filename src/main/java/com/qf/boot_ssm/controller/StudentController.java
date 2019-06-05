package com.qf.boot_ssm.controller;

import com.qf.boot_ssm.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class StudentController {

    @RequestMapping("login")
    public String exController(  Model model){
//        System.out.println("----"+student);
        model.addAttribute("name","aha");
        return "index";
    }
}
