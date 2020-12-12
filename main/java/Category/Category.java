package Category;

import java.util.List;

import uudai.uudai;

public class Category {
    private String nameCategory;
    private List<uudai> uudais;
    public Category(String nameCategory, List<uudai> uudais){
        this.nameCategory = nameCategory;
        this.uudais = uudais;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<uudai> getUudais() {
        return uudais;
    }

    public void setUudais(List<uudai> uudais) {
        this.uudais = uudais;
    }
}
