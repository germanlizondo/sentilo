package com.example.sentilo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller

public class IndexController {

    @RequestMapping("/hola")
    public String index() {
        return ("index");
    }

    @RequestMapping("/login")
    public String login() {
        return ("login");
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam Map<String,String> allParams){
        System.out.println("HELLO THERE"+allParams.entrySet());
        return "redirect:/";
    }

    @RequestMapping("/signup")
    public String signup() {
        return ("signup");
    }

    @PostMapping("/signup")
    public String postSignup(@RequestParam Map<String,String> allParams){
        System.out.println("HELLO THERE"+allParams.entrySet());
        return "redirect:/";
    }
}