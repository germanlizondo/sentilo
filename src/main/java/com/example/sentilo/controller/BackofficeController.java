package com.example.sentilo.controller;

import com.example.sentilo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;


@Controller
public class BackofficeController {




    @RequestMapping("/backoffice")
    public String index() {
        return ("backoffice/index");
    }

    @RequestMapping("/backoffice/users")
    public ModelAndView users() {

        ArrayList<User> users = new ArrayList<User>();

        users.add(new User("german","12345"));

        ModelAndView mv = new ModelAndView();

        mv.setViewName("backoffice/users");
        mv.addObject("users",users);

        return mv;
    }
}
