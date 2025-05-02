package com.example.recyclerview;

public class Artwork {
    private String title;
    private int imageResId;

    public Artwork(String title, int imageResId) {
        this.title = title;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResId() {
        return imageResId;
    }
}
