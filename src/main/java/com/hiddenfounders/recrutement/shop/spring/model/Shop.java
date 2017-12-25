package com.hiddenfounders.recrutement.shop.spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shops")
public class Shop {

    @Id
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
