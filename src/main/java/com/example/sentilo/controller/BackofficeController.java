package com.example.sentilo.controller;

import com.example.sentilo.model.Application;
import com.example.sentilo.model.Provider;
import com.example.sentilo.model.User;
import com.example.sentilo.repositories.ApplicationRepository;
import com.example.sentilo.repositories.ProviderRepository;
import com.example.sentilo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;



@Controller
public class BackofficeController {


    /**
     * UserRepository per accedir al Mongo
     * a la colleció Users
     */
    @Autowired
    private UserRepository repositoriUser;
    /**
     * UserRepository per accedir al Mongo
     * a la colleció Aplications
     */
    @Autowired
    private ApplicationRepository repositoriApplication;
    /**
     * UserRepository per accedir al Mongo
     * a la colleció Providers
     */
    @Autowired
    private ProviderRepository repositoriProvider;

    /**
     * Ruta /backoofice GET
     */
    @RequestMapping("/backoffice")
    public String index() {
            return ("backoffice/index");
    }

    /**
     * Ruta /backoofice/users GET
     */
    @RequestMapping("/backoffice/users")
    public ModelAndView users() {

        ArrayList<User> users = new ArrayList<User>();

        users = (ArrayList<User>) repositoriUser.findAll();
        ModelAndView mv = new ModelAndView();

        mv.setViewName("backoffice/users");
        mv.addObject("users",users);

        return mv;
    }
    /**
     * Ruta /backoofice/user/delete POST
     */
    @PostMapping("/backoffice/users/delete/{name}")
    public String deleteSensor(@PathVariable String name){
        System.out.println(name);
        User user = repositoriUser.findByName(name);
        repositoriUser.delete(user);
        return "redirect:/backoffice/users";
    }
    /**
     * Ruta /backoffice/applications GET
     */
    @RequestMapping("/backoffice/applications")
    public ModelAndView aplications() {

        ArrayList<Application> applications = new ArrayList<Application>();

        applications = (ArrayList<Application>) repositoriApplication.findAll();
        ModelAndView mv = new ModelAndView();

        mv.setViewName("backoffice/applications");
        mv.addObject("applications",applications);

        return mv;
    }



    /**
     * Ruta /backoffice/applications/new GET
     */
    @RequestMapping("/backoffice/applications/new")
    public String newApplication() {
        return ("backoffice/newapplication");
    }
    /**
     * Ruta /backoffice/new-application POST
     */
    @PostMapping("/new-application")
    public String postSignup(@RequestParam Map<String,String> allParams){


            repositoriApplication.save(new Application(allParams.get("name"),allParams.get("description")));
            return "redirect:/backoffice/applications";


    }
    /**
     * Ruta /backoffice/application/{name} GET
     */
    @RequestMapping("/backoffice/application/{name}")
    public ModelAndView getApplication(@PathVariable String name) {
        ModelAndView mv = new ModelAndView();

        Application app = repositoriApplication.findByName(name);
        System.out.println(app);
        mv.setViewName("backoffice/getapplication");
        mv.addObject("app",app);
        return mv;
    }
    /**
     * Ruta /backoffice/application/{name}/addpermissions GET
     */
    @RequestMapping("/backoffice/application/{name}/addpermissions")
    public ModelAndView getAddPermissions(@PathVariable String name) {
        ModelAndView mv = new ModelAndView();

        Application app = repositoriApplication.findByName(name);
        System.out.println(app);
        mv.setViewName("backoffice/addPermissions");
        mv.addObject("app",app);
        return mv;
    }

    /**
     * Ruta /backoffice/providers GET
     */
    @RequestMapping("/backoffice/providers")
    public ModelAndView providers() {

        ArrayList<Provider> providers;

        providers = (ArrayList<Provider>) repositoriProvider.findAll();
        ModelAndView mv = new ModelAndView();

        mv.setViewName("backoffice/providers/providers");
        mv.addObject("providers",providers);

        return mv;
    }
    /**
     * Ruta /backoffice/provider/new GET
     */
    @RequestMapping("/backoffice/provider/new")
    public String newSensor() {
        return ("backoffice/providers/newprovider");
    }

    /**
     * Ruta /backoffice/new-provider POST
     */
    @PostMapping("new-provider")
    public String newProvider(@RequestParam Map<String,String> allParams){

        Provider provider = new Provider();
        provider.setName(allParams.get("name"));

        this.repositoriProvider.save(provider);
        return "redirect:/backoffice/providers";

    }
    /**
     * Ruta /backoffice/providers/{name} GET
     */
    @RequestMapping("/backoffice/providers/{name}")
    public ModelAndView getProvider(@PathVariable String name) {
        ModelAndView mv = new ModelAndView();

        Provider provider = repositoriProvider.findByName(name);
        mv.setViewName("backoffice/providers/getprovider");
        mv.addObject("provider",provider);
        return mv;
    }
    /**
     * Ruta /backoffice/profile GET
     */
    @RequestMapping("/backoffice/profile")
    public  ModelAndView  getProfile(@SessionAttribute("user") User user) {

        System.out.println(user);

        ModelAndView mv = new ModelAndView();

        mv.setViewName("/backoffice/profile");
        mv.addObject("user",user);
        return mv;
    }



}
