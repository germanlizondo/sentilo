package com.example.sentilo.controller;

import com.example.sentilo.model.Sensor;
import com.example.sentilo.repositories.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class SensorsController {

    @Autowired
    private SensorRepository sensorRepository;
    /**
     * Ruta /backoffice/sensors GET
     */
    @RequestMapping("/backoffice/sensors")
    public ModelAndView index() {

        ArrayList<Sensor> sensors = new ArrayList<Sensor>();
        sensors = (ArrayList<Sensor>) this.sensorRepository.findAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("backoffice/sensors/sensors");
        mv.addObject("sensors",sensors);

        return mv;
    }
    /**
     * Ruta /backoffice/sensors GET
     */
    @RequestMapping("/backoffice/sensors/{name}")
    public ModelAndView getApplication(@PathVariable String name) {
        ModelAndView mv = new ModelAndView();

        Sensor sensor = sensorRepository.findByName(name);
        mv.setViewName("backoffice/sensors/getsensor");
        mv.addObject("sensor",sensor);
        return mv;
    }

    /**
     * Ruta /backoffice/sensors/new GET
     */
    @RequestMapping("/backoffice/sensor/new")
    public String newSensor() {
        return ("backoffice/sensors/newsensor");
    }
    /**
     * Ruta /new-sensor GET
     */
    @PostMapping("new-sensor")
    public String newSesnor(@RequestParam Map<String,String> allParams){


        sensorRepository.save(new Sensor(allParams.get("name")));
        return "redirect:/backoffice/sensors";

    }
    /**
     * Ruta /backoffice/sensors/delete/{name} POST
     */
    @PostMapping("/backoffice/sensors/delete/{name}")
    public String deleteSensor(@PathVariable String name){
        System.out.println(name);
        Sensor sensor = sensorRepository.findByName(name);
        sensorRepository.delete(sensor);
        return "redirect:/backoffice/sensors";
    }

}
