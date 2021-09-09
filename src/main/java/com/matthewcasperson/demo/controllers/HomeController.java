// src/main/java/com/matthewcasperson/demo/controllers/HomeController.java

package com.matthewcasperson.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String main() {
        return "index";
    }
}