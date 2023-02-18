package com.demo.activity.entity;

public class Activity {
    private String title1;
    private String title2;
    private String title3;
    private String text1;
    private String img1;


    public Activity(String title1, String title2, String title3, String text1, String img1) {
        this.title1 = title1;
        this.title2 = title2;
        this.title3 = title3;
        this.text1 = text1;
        this.img1 = img1;
    }

    public Activity(String title3, String text1) {
        this.title3 = title3;
        this.text1 = text1;
    }

    public Activity() {
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }
}
