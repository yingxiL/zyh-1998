package com.demo.city.entity;

public class City {
    private int id;
    private String name;
    private String value;
    private String country;
    private String values;


    public City(String name, String value, String country, String values) {
        this.name = name;
        this.value = value;
        this.country = country;
        this.values = values;
    }

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
