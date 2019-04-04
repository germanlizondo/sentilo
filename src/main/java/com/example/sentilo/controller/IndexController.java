package com.example.sentilo.controller;

import com.example.sentilo.model.User;
import com.example.sentilo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller

public class IndexController {

    @Autowired
    private UserRepository repositori;

    @RequestMapping("/")
    public String index() {
        return ("mainpage/index");
    }

    @RequestMapping("/login")
    public String login() {
        return ("mainpage/login");
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam Map<String,String> allParams){
        System.out.println("HELLO THERE"+allParams.entrySet());
        return "redirect:/";
    }

    @RequestMapping("/signup")
    public String signup() {
        return ("mainpage/signup");
    }

    @PostMapping("/signup")
    public String postSignup(@RequestParam Map<String,String> allParams){


        if(allParams.get("password").equals(allParams.get("passwordCorrect"))){

           System.out.println("HELLO THERE"+allParams);
         repositori.save(new User(allParams.get("user"),allParams.get("password")));
            return "redirect:/";
        }else{
            return "redirect:/errorSignup";
        }

    }



    @RequestMapping("/errorSignup")
    public String errorSignup() {
        return ("mainpage/errorSignup");
    }


}