package com.demo.img.entity;

public class Img {
    private int i_id;
    private String i_name;
    private String i_title;
    private String i_list;
    private String i_img;
    private String i_img1;

    public Img(String i_name, String i_title, String i_list, String i_img, String i_img1) {
        this.i_name = i_name;
        this.i_title = i_title;
        this.i_list = i_list;
        this.i_img = i_img;
        this.i_img1 = i_img1;
    }

    public Img() {
    }

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public String getI_list() {
        return i_list;
    }

    public void setI_list(String i_list) {
        this.i_list = i_list;
    }

    public String getI_img() {
        return i_img;
    }

    public void setI_img(String i_img) {
        this.i_img = i_img;
    }

    public String getI_img1() {
        return i_img1;
    }

    public void setI_img1(String i_img1) {
        this.i_img1 = i_img1;
    }

    public String getI_title() {
        return i_title;
    }

    public void setI_title(String i_title) {
        this.i_title = i_title;
    }

    public String getI_name() {
        return i_name;
    }

    public void setI_name(String i_name) {
        this.i_name = i_name;
    }
}
