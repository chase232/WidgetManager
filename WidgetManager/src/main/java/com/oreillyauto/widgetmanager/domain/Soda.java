package com.oreillyauto.widgetmanager.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "soda")
public class Soda implements Serializable {

    private static final long serialVersionUID = 4860897329507163934L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INTEGER")
    private Integer id;
    
    @Column(name = "name", columnDefinition = "VARCHAR(20)")
    private String name;
    
    @Column(name = "color", columnDefinition = "VARCHAR(20)")
    private String color;
    
    @Column(name = "brand", columnDefinition = "VARCHAR(20)")
    private String brand;
    
    public Soda() { }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
