package com.practice.adapters.model;

public class Behavioral {
    private String name;
    private int imgRes;
    private boolean state;

    public Behavioral() {
    }

    public Behavioral(String name, int imgRes) {
        this.name = name;
        this.imgRes = imgRes;
        this.state = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
