package com.example.android.tourguideapp;

public class Location {

    private String mDescription;
    private int mImageResourceId;

    public Location(int imageResourceId,String description) {
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getDescription() {

        return mDescription;
    }

    public int getImageResourceId() {

        return mImageResourceId;
    }
}
