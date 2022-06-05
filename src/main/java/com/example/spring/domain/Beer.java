package com.example.spring.domain;

import java.util.ArrayList;

public class Beer {
    private String name;
    private String rate;
    private String des;
    private String image;
    private String link;

    public Beer(String name, String rate, String des, String image, String link) {
        this.name = name;
        this.rate = rate;
        this.des = des;
        this.image = image;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
