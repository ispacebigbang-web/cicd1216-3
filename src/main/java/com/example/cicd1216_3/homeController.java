package com.example.cicd1216_3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/hi")
public String hi (){return "hi there";}
}

