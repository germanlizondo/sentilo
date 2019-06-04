package com.example.sentilo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;

public class Component {
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
     * sensores
     */
    private ArrayList<Sensor> sensores = new ArrayList<>();
    /**
     * Constructor Vacio POJO
     */
    public Component() {
    }

    /**
     * Constructor
     * @param name
     */
    public Component(String name) {
        this.name = name;
        this.creationDate = new Date();
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

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
}
