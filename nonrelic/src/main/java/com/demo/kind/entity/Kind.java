package com.demo.kind.entity;

public class Kind {
    private int k_id;
    private String k_name;
    private String k_text;

    public Kind(String k_name, String k_text) {
        this.k_name = k_name;
        this.k_text = k_text;
    }

    public Kind(int k_id, String k_name, String k_text) {
        this.k_id = k_id;
        this.k_name = k_name;
        this.k_text = k_text;
    }

    public Kind() {
    }

    public int getK_id() {
        return k_id;
    }

    public void setK_id(int k_id) {
        this.k_id = k_id;
    }

    public String getK_name() {
        return k_name;
    }

    public void setK_name(String k_name) {
        this.k_name = k_name;
    }

    public String getK_text() {
        return k_text;
    }

    public void setK_text(String k_text) {
        this.k_text = k_text;
    }
}
