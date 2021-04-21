package com.hyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping("hello")

    public String hello(Model model){
        model.addAttribute("msg","hello注解");
        return "hello";
    }
}
