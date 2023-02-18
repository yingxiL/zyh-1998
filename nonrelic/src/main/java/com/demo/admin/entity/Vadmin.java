package com.demo.admin.entity;

public class Vadmin {
    private int v_id;
    private String v_name;
    private String v_account;
    private String v_pwd;
    private String v_mb;
    private String v_adr;
    private String v_phone;
    private String v_card;
    private String v_role;

    public Vadmin(int v_id, String v_name, String v_account, String v_pwd, String v_mb, String v_adr, String v_phone, String v_card, String v_role) {
        this.v_id = v_id;
        this.v_name = v_name;
        this.v_account = v_account;
        this.v_pwd = v_pwd;
        this.v_mb = v_mb;
        this.v_adr = v_adr;
        this.v_phone = v_phone;
        this.v_card = v_card;
        this.v_role = v_role;
    }

    public Vadmin(String v_name, String v_account, String v_pwd, String v_mb, String v_adr, String v_phone, String v_card, String v_role) {
        this.v_name = v_name;
        this.v_account = v_account;
        this.v_pwd = v_pwd;
        this.v_mb = v_mb;
        this.v_adr = v_adr;
        this.v_phone = v_phone;
        this.v_card = v_card;
        this.v_role = v_role;
    }

    public Vadmin() {
    }

    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getV_account() {
        return v_account;
    }

    public void setV_account(String v_account) {
        this.v_account = v_account;
    }

    public String getV_pwd() {
        return v_pwd;
    }

    public void setV_pwd(String v_pwd) {
        this.v_pwd = v_pwd;
    }

    public String getV_adr() {
        return v_adr;
    }

    public void setV_adr(String v_adr) {
        this.v_adr = v_adr;
    }

    public String getV_mb() {
        return v_mb;
    }

    public void setV_mb(String v_mb) {
        this.v_mb = v_mb;
    }

    public String getV_phone() {
        return v_phone;
    }

    public void setV_phone(String v_phone) {
        this.v_phone = v_phone;
    }

    public String getV_card() {
        return v_card;
    }

    public void setV_card(String v_card) {
        this.v_card = v_card;
    }

    public String getV_role() {
        return v_role;
    }

    public void setV_role(String v_role) {
        this.v_role = v_role;
    }
}
