package com.example.baithi;

public class DoAn {
    private String Name;
    private String Gia;
    private int Photo;

    public DoAn(int photo, String name, String gia ) {
        Name = name;
        Gia = gia;
        Photo = photo;

    }

    public DoAn() {
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}