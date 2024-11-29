package com.example.frontend.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/index")
    public String homePage(){
        return "index";
    }
}
