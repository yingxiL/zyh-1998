package com.demo.drawer.entity;

public class Drawer {
    private String d_span;
    private String d_span1;
    private String d_span2;
    private String d_img;

    public Drawer(String d_span, String d_span1, String d_span2, String d_img) {
        this.d_span = d_span;
        this.d_span1 = d_span1;
        this.d_span2 = d_span2;
        this.d_img = d_img;
    }

    public Drawer() {
    }

    public String getD_span() {
        return d_span;
    }

    public void setD_span(String d_span) {
        this.d_span = d_span;
    }

    public String getD_span1() {
        return d_span1;
    }

    public void setD_span1(String d_span1) {
        this.d_span1 = d_span1;
    }

    public String getD_span2() {
        return d_span2;
    }

    public void setD_span2(String d_span2) {
        this.d_span2 = d_span2;
    }

    public String getD_img() {
        return d_img;
    }

    public void setD_img(String d_img) {
        this.d_img = d_img;
    }
}
