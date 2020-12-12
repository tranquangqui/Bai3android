package Catergory_douong;

import java.util.List;

import douong.DoUong;
import uudai.uudai;

public class Category_douong {
    private String nameCategory;
    private List<DoUong> douongs;

    public Category_douong(String nameCategory, List<DoUong> douongs) {
        this.nameCategory = nameCategory;
        this.douongs = douongs;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<DoUong> getDouongs() {
        return douongs;
    }

    public void setDouongs(List<DoUong> douongs) {
        this.douongs = douongs;
    }
}
