package com.demo.project.entity;

import java.util.Date;

public class Project {
    private int p_id;
    private String p_name;
    private String p_profile;
    private String p_content;
    private Date p_time;
    private String p_adr;
    private String p_products;

    public Project(int p_id, String p_name, String p_profile, String p_content, Date p_time, String p_adr, String p_products) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_profile = p_profile;
        this.p_content = p_content;
        this.p_time = p_time;
        this.p_adr = p_adr;
        this.p_products = p_products;
    }

    public Project(String p_name, String p_profile) {
        this.p_name = p_name;
        this.p_profile = p_profile;
    }

    public Project() {
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_profile() {
        return p_profile;
    }

    public void setP_profile(String p_profile) {
        this.p_profile = p_profile;
    }

    public String getP_content() {
        return p_content;
    }

    public void setP_content(String p_content) {
        this.p_content = p_content;
    }

    public Date getP_time() {
        return p_time;
    }

    public void setP_time(Date p_time) {
        this.p_time = p_time;
    }

    public String getP_adr() {
        return p_adr;
    }

    public void setP_adr(String p_adr) {
        this.p_adr = p_adr;
    }

    public String getP_products() {
        return p_products;
    }

    public void setP_products(String p_products) {
        this.p_products = p_products;
    }
}
