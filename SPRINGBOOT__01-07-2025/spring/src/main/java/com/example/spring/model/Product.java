package com.example.spring.model;

public class Product {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {       // fixed return type
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
