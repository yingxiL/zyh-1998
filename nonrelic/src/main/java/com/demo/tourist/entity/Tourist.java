package com.demo.tourist.entity;

public class Tourist {
    private int t_id;
    private String t_name;
    private int t_age;
    private String t_mb;
    private String t_phone;
    private String t_card;
    private String t_adr;

    public Tourist(int t_id, String t_name, int t_age, String t_mb, String t_phone, String t_card, String t_adr) {
        this.t_id = t_id;
        this.t_name = t_name;
        this.t_age = t_age;
        this.t_mb = t_mb;
        this.t_phone = t_phone;
        this.t_card = t_card;
        this.t_adr = t_adr;
    }

    public Tourist(String t_name, int t_age, String t_mb, String t_phone, String t_card, String t_adr) {
        this.t_name = t_name;
        this.t_age = t_age;
        this.t_mb = t_mb;
        this.t_phone = t_phone;
        this.t_card = t_card;
        this.t_adr = t_adr;
    }

    public Tourist() {
    }

    public String getT_mb() {
        return t_mb;
    }

    public void setT_mb(String t_mb) {
        this.t_mb = t_mb;
    }

    public String getT_phone() {
        return t_phone;
    }

    public void setT_phone(String t_phone) {
        this.t_phone = t_phone;
    }

    public String getT_card() {
        return t_card;
    }

    public void setT_card(String t_card) {
        this.t_card = t_card;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public int getT_age() {
        return t_age;
    }

    public void setT_age(int t_age) {
        this.t_age = t_age;
    }

    public String getT_adr() {
        return t_adr;
    }

    public void setT_adr(String t_adr) {
        this.t_adr = t_adr;
    }
}
