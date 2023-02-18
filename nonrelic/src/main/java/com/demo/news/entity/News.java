package com.demo.news.entity;

public class News {
    private String n_name;
    private String n_title;
    private String n_text;
    private String n_img;
    private String i_title;
    private String i_text;

    public News(String n_name, String n_text,String n_title,String n_img,String i_text,String i_title) {
        this.n_name = n_name;
        this.n_text = n_text;
        this.n_title = n_title;
        this.n_img = n_img;
        this.i_text= i_text;
        this.i_title = i_title;
    }

    public News() {
    }

    public String getI_title() {
        return i_title;
    }

    public void setI_title(String i_title) {
        this.i_title = i_title;
    }

    public String getI_text() {
        return i_text;
    }

    public void setI_text(String i_text) {
        this.i_text = i_text;
    }

    public String getN_img() {
        return n_img;
    }

    public void setN_img(String n_img) {
        this.n_img = n_img;
    }

    public String getN_title() {
        return n_title;
    }

    public void setN_title(String n_title) {
        this.n_title = n_title;
    }

    public String getN_name() {
        return n_name;
    }

    public void setN_name(String n_name) {
        this.n_name = n_name;
    }

    public String getN_text() {
        return n_text;
    }

    public void setN_text(String n_text) {
        this.n_text = n_text;
    }
}
