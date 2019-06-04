package com.example.sentilo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;

public class Application {

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
     * permissions
     */
    private ArrayList<Permiso> permissions = new ArrayList<Permiso>();
    /**
     * Constructor Vacio POJO
     */
    public Application() {
    }
    /**
     * Constructor Recibe
     * @param name
     * @param description
     */
    public Application(String name, String description) {
        this.name = name;
        this.description = description;
        this.creationDate = new Date();
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", permissions=" + permissions +
                '}';
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

    public ArrayList<Permiso> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<Permiso> permissions) {
        this.permissions = permissions;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
