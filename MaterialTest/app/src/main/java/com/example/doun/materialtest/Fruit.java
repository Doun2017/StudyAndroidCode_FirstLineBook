package com.example.doun.materialtest;

/**
 * Created by Doun on 2017/1/15.
 */

public class Fruit {
    public Fruit(String name, int imageID) {
        this.name = name;
        this.imageID = imageID;
    }

    private String name;

    private int imageID;


    public int getImageID() {
        return imageID;
    }

    public String getName() {
        return name;
    }

}
