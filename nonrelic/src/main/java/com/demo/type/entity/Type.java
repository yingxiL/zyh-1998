package com.demo.type.entity;

public class Type {
    private int id;
    private int c_id;
    private String c_no;
    private String c_name;
    private String c_class;
    private String c_type;
    private String c_time;
    private String c_unit;

    public Type(int id, int c_id, String c_no, String c_name, String c_class, String c_type, String c_time, String c_unit) {
        this.id = id;
        this.c_id = c_id;
        this.c_no = c_no;
        this.c_name = c_name;
        this.c_class = c_class;
        this.c_type = c_type;
        this.c_time = c_time;
        this.c_unit = c_unit;
    }

    public Type(int c_id, String c_no, String c_name, String c_class, String c_type, String c_time, String c_unit) {
        this.c_id = c_id;
        this.c_no = c_no;
        this.c_name = c_name;
        this.c_class = c_class;
        this.c_type = c_type;
        this.c_time = c_time;
        this.c_unit = c_unit;
    }

    public Type() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getC_no() {
        return c_no;
    }

    public void setC_no(String c_no) {
        this.c_no = c_no;
    }

    public String getC_time() {
        return c_time;
    }

    public void setC_time(String c_time) {
        this.c_time = c_time;
    }

    public String getC_unit() {
        return c_unit;
    }

    public void setC_unit(String c_unit) {
        this.c_unit = c_unit;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_class() {
        return c_class;
    }

    public void setC_class(String c_class) {
        this.c_class = c_class;
    }

    public String getC_type() {
        return c_type;
    }

    public void setC_type(String c_type) {
        this.c_type = c_type;
    }
}
