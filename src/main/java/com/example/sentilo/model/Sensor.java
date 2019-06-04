package com.example.sentilo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;

public class Sensor {
    /**
     * ID
     */
    @Id
    private ObjectId id;
    /**
     * name
     */
    private String name;
    /**
     * description
     */
    private String description;
    /**
     * creationDate
     */
    private Date creationDate;
    /**
     * type
     */
    private String type;
    /**
     * data
     */
    private ArrayList<Double> data;
    /**
     * Constructor Vacio POJO
     */
    public Sensor() {
    }

    /**
     * Constructor
     * @param name
     */
    public Sensor(String name) {
        this.name = name;
        this.creationDate = new Date();
        this.data = new ArrayList<>();
    }

    public void addData(double valor){
        this.data.add(valor);
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Double> getData() {
        return data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }
}
