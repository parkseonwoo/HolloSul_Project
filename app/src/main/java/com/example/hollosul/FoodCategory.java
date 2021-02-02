package com.example.hollosul;

public class FoodCategory {
    private String name, sub_title;
    private int thumbnail;

    public FoodCategory(String name, String sub_title, int thumbnail) {
        this.name = name;
        this.sub_title = sub_title;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public String getSub_title() {
        return sub_title;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
