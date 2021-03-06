package com.example.sentilo.controller;

import com.example.sentilo.model.User;
import com.example.sentilo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@SessionAttributes("user")
public class IndexController {


    @ModelAttribute("user")
    public User setUpUserForm() {
        User user = new User();
        return user;
    }

    @Autowired
    private UserRepository repositori;
    /**
     * Ruta / GET
     */
    @RequestMapping("/")
    public String index() {
        return ("mainpage/index");
    }
    /**
     * Ruta /login GET
     */
    @RequestMapping("/login")
    public String login() {
        return ("mainpage/login");
    }
    /**
     * Ruta /login POST
     */
    @PostMapping("/login")
    public String postLogin(@ModelAttribute("user") User user,@RequestParam Map<String,String> allParams){

       User usuario = this.repositori.findByName(allParams.get("user"));

        if(usuario!=null){

            if(user.getPassword().equals(allParams.get("password"))){


                user.setName(usuario.getName());
                user.setRole(usuario.getRole());

                System.out.println(usuario);
                return "redirect:/backoffice/profile";

            }else{
                return "redirect:/login";

            }
        }else{
            return "redirect:/login";
        }

    }
    /**
     * Ruta /signup GET
     */
    @RequestMapping("/signup")
    public String signup() {
        return ("mainpage/signup");
    }
    /**
     * Ruta /signup POST
     */
    @PostMapping("/signup")
    public String postSignup(@RequestParam Map<String,String> allParams){


        if(allParams.get("password").equals(allParams.get("passwordCorrect"))){

           System.out.println("HELLO THERE"+allParams);
         repositori.save(new User(allParams.get("user"),allParams.get("password"),allParams.get("role"),allParams.get("email")));
            return "redirect:/";
        }else{
            return "redirect:/errorSignup";
        }

    }


    /**
     * Ruta /errorSignup GET
     */
    @RequestMapping("/errorSignup")
    public String errorSignup() {
        return ("mainpage/errorSignup");
    }
    /**
     * Ruta /logout GET
     */
    @RequestMapping("/logout")
    public String logout(@ModelAttribute("user") User user) {

        user = null;
        return "redirect:/";
    }


}