package com.example.sentilo.controller;

import com.example.sentilo.model.Sensor;
import com.example.sentilo.repositories.SensorRepository;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private SensorRepository sensorRepository;
    /**
     * Ruta /data/{name} PUT
     */
    @PutMapping("/data/{name}/{valor}")
    public JSONObject putData(@PathVariable String name,@PathVariable Double valor){
        JSONObject json = new JSONObject();

        Sensor sensor = sensorRepository.findByName(name);
        if(sensor != null){
            sensor.addData(valor);
            sensorRepository.save(sensor);
            json.put("sesnor",sensor.getName());
            json.put("valor",valor);
            json.put("status",200);

        }else{
            json.put("status",400);
            json.put("erro","Not exist sensor");
        }
        return json;
    }
    /**
     * Ruta /getdata/{name} GET
     */
    @GetMapping("getdata/{name}")
    public JSONObject getData(@PathVariable String name){
        JSONObject json = new JSONObject();
        Sensor sensor = sensorRepository.findByName(name);
        if(sensor != null){
           json.put("sensor",sensor.getName());
           json.put("data",sensor.getData());

        }else{
            json.put("status",400);
            json.put("erro","Not exist sensor");
        }
        return json;
    }
    }

