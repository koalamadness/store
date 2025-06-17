package com.cs.store;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CasaController {
    @GetMapping("/casa")
    public String casa() {
        return "casa.html";
    }
}
