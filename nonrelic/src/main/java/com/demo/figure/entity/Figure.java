package com.demo.figure.entity;

public class Figure {
    private int f_id;
    private String n_name;
    private String n_type;
    private String f_name;
    private String f_age;
    private String f_text;
    private String adr;

    public Figure(int f_id, String n_name, String n_type, String f_name, String f_age, String f_text, String adr) {
        this.f_id = f_id;
        this.n_name = n_name;
        this.n_type = n_type;
        this.f_name = f_name;
        this.f_age = f_age;
        this.f_text = f_text;
        this.adr = adr;
    }

    public Figure(String n_name, String n_type, String f_name, String f_age, String f_text, String adr) {
        this.n_name = n_name;
        this.n_type = n_type;
        this.f_name = f_name;
        this.f_age = f_age;
        this.f_text = f_text;
        this.adr = adr;
    }

    public Figure() {
    }

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public String getN_type() {
        return n_type;
    }

    public void setN_type(String n_type) {
        this.n_type = n_type;
    }

    public String getF_age() {
        return f_age;
    }

    public void setF_age(String f_age) {
        this.f_age = f_age;
    }

    public String getF_text() {
        return f_text;
    }

    public void setF_text(String f_text) {
        this.f_text = f_text;
    }

    public String getN_name() {
        return n_name;
    }

    public void setN_name(String n_name) {
        this.n_name = n_name;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }
}
