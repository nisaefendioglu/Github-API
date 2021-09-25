package com.nisaefendioglu.github.Model;

import java.io.Serializable;

public class Repo implements Serializable {

    private String name, description;

    public Repo() {
    }

    public Repo(String name, String description) {
        this.name = name;
        this.description = description;
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
}
