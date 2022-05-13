package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Circle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private int size;

    private int color;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}