package com.example.devops.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String welcome(Model model){
        model.addAttribute("course","DevOps Senior");
        return "index";
    }

//    @RequestMapping("/listsname")
//    public String name(Model model){
//        return "index";
//    }
}
