package com.camtech.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebSiteController {

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/humanRessources")
    public String humanRessources(){
        return "humanRessources";
    }

    @GetMapping("/advisory")
    public String advisory(){
        return "advisory";
    }

    @GetMapping("/training")
    public String training(){
        return "training";
    }

    @GetMapping("/survey")
    public String survey(){
        return "survey";
    }

}
