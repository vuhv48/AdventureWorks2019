package edu.fa.AdventureWorkSpringView.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Wellcome {

    @RequestMapping("/hello")
    public String hello(){
        return "wellcome";
    }
}
