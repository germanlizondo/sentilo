package com.example.sentilo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Permiso {

    @Id
    private ObjectId identifier;

    private Provider provider;
    private String type;

    public Permiso() {
    }

    public Permiso(Provider provider, String type) {
        this.provider = provider;
        this.type = type;
    }

    public ObjectId getIdentifier() {
        return identifier;
    }

    public void setIdentifier(ObjectId identifier) {
        this.identifier = identifier;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
