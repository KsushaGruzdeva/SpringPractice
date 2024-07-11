package com.springpractice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "service")
public class Service extends BaseEntity {
    private String name;
    private int price;

    protected Service() {}

    public Service (String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Column (name = "name")
    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Column (name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }
}