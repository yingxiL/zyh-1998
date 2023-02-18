package com.demo.knowledge.entity;

public class Knowledge {
    private int k_id;
    private String id;
    private String name;
    private String text;
    private String name1;
    private String text1;

    public Knowledge(int k_id, String id, String name, String text, String name1, String text1) {
        this.k_id = k_id;
        this.id = id;
        this.name = name;
        this.text = text;
        this.name1 = name1;
        this.text1 = text1;
    }

    public Knowledge(String id, String name, String text, String name1, String text1) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.name1 = name1;
        this.text1 = text1;
    }

    public int getK_id() {
        return k_id;
    }

    public void setK_id(int k_id) {
        this.k_id = k_id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public Knowledge(String id, String name, String text) {
        this.id = id;
        this.name = name;
        this.text = text;
    }

    public Knowledge() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
