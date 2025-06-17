package com.cs.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.plaf.synth.SynthScrollBarUI;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index() {
        System.out.println("AppName: " + appName);
        String viewName = getViewName();
        return viewName;
    }

    private String getViewName(){
        return "index.html";
    }

    
}


