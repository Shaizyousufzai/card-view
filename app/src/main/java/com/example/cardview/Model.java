package com.example.cardview;

public class Model {
    private String Waterfall_title;
    private int Waterfall_image;

    public Model(String waterfall_title, int waterfall_image) {
        Waterfall_title = waterfall_title;
        Waterfall_image = waterfall_image;
    }

    public String getWaterfall_title() {
        return Waterfall_title;
    }

    public void setWaterfall_title(String waterfall_title) {
        Waterfall_title = waterfall_title;
    }

    public int getWaterfall_image() {
        return Waterfall_image;
    }

    public void setWaterfall_image(int waterfall_image) {
        Waterfall_image = waterfall_image;
    }
}
