package com.example.sentilo.controller;

import com.example.sentilo.model.Application;
import com.example.sentilo.model.User;
import com.example.sentilo.repositories.ApplicationRepository;
import com.example.sentilo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;


@Controller
public class BackofficeController {

    @Autowired
    private UserRepository repositoriUser;
    @Autowired
    private ApplicationRepository repositoriApplication;


    @RequestMapping("/backoffice")
    public String index() {
        return ("backoffice/index");
    }

    @RequestMapping("/backoffice/users")
    public ModelAndView users() {

        ArrayList<User> users = new ArrayList<User>();

        users = (ArrayList<User>) repositoriUser.findAll();
        ModelAndView mv = new ModelAndView();

        mv.setViewName("backoffice/users");
        mv.addObject("users",users);

        return mv;
    }


    @RequestMapping("/backoffice/applications")
    public ModelAndView aplications() {

        ArrayList<Application> applications = new ArrayList<Application>();

        applications = (ArrayList<Application>) repositoriApplication.findAll();
        ModelAndView mv = new ModelAndView();

        mv.setViewName("backoffice/applications");
        mv.addObject("applications",applications);

        return mv;
    }




    @RequestMapping("/backoffice/applications/new")
    public String newApplication() {
        return ("backoffice/newapplication");
    }

    @PostMapping("/new-application")
    public String postSignup(@RequestParam Map<String,String> allParams){



            System.out.println("HELLO THERE"+allParams);
            repositoriApplication.save(new Application(allParams.get("name"),allParams.get("description")));
            return "redirect:/backoffice/applications";


    }

    @RequestMapping("/backoffice/application/{name}")
    public ModelAndView getApplication(@PathVariable String name) {
        ModelAndView mv = new ModelAndView();

        Application app = repositoriApplication.findByName(name);
        System.out.println(app);
        mv.setViewName("backoffice/getapplication");
        mv.addObject("app",app);
        return mv;
    }

}
