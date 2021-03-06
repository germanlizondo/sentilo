package com.example.sentilo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class User {

    @Id
    private ObjectId id;

    private String name;
    private String password;
    private String role;
    private Date dataCreate;
    private String email;

    public User() {

    }

    public User(String name, String password,String role,String email) {
        this.name = name;
        this.password = password;
        this.role = role;
        this.email = email;
        this.dataCreate = new Date();
    }


    @Override
    public String toString() {
        return "ID: "+this.id+" | NOM: "+this.name+" | PASSWORD: "+this.password;
    }

    /**
     * Gets id.
     *
     * @return Value of id.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Sets new password.
     *
     * @param password New value of password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets new id.
     *
     * @param id New value of id.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets password.
     *
     * @return Value of password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(Date dataCreate) {
        this.dataCreate = dataCreate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
