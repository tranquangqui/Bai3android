package com.example.baithi;

public class Contact {
    private int mImage1;
    private String mName;

    public Contact(int mImage1,String mName) {
        this.mImage1 = mImage1;
        this.mName = mName;

    }

    public int getmImage1() {
        return mImage1;
    }

    public void setmImage1(int mImage1) {
        this.mImage1 = mImage1;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}