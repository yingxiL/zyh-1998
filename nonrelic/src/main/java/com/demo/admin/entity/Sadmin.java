package com.demo.admin.entity;

public class Sadmin {
    private int s_id;
    private String s_name;
    private String s_account;
    private String s_pwd;
    private String s_mb;
    private String s_adr;
    private String s_phone;
    private String s_card;

    public Sadmin(int s_id, String s_name, String s_account, String s_pwd, String s_mb, String s_adr, String s_phone, String s_card) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_account = s_account;
        this.s_pwd = s_pwd;
        this.s_mb = s_mb;
        this.s_adr = s_adr;
        this.s_phone = s_phone;
        this.s_card = s_card;
    }

    public Sadmin(String s_name, String s_account, String s_pwd, String s_mb, String s_adr, String s_phone, String s_card) {
        this.s_name = s_name;
        this.s_account = s_account;
        this.s_pwd = s_pwd;
        this.s_mb = s_mb;
        this.s_adr = s_adr;
        this.s_phone = s_phone;
        this.s_card = s_card;
    }

    public Sadmin() {
    }

    public String getS_mb() {
        return s_mb;
    }

    public void setS_mb(String s_mb) {
        this.s_mb = s_mb;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_account() {
        return s_account;
    }

    public void setS_account(String s_account) {
        this.s_account = s_account;
    }

    public String getS_pwd() {
        return s_pwd;
    }

    public void setS_pwd(String s_pwd) {
        this.s_pwd = s_pwd;
    }

    public String getS_adr() {
        return s_adr;
    }

    public void setS_adr(String s_adress) {
        this.s_adr = s_adress;
    }

    public String getS_phone() {
        return s_phone;
    }

    public void setS_phone(String s_phone) {
        this.s_phone = s_phone;
    }

    public String getS_card() {
        return s_card;
    }

    public void setS_card(String s_card) {
        this.s_card = s_card;
    }
}
