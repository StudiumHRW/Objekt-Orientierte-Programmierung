package de.hsruhrwest.oop.ss2025.praktikum6.a1;

public abstract class AbstractKitchenUtensils {
    private String kitchenUtensilsName;

    public AbstractKitchenUtensils(String kitchenUtensilsName) {
        this.kitchenUtensilsName = kitchenUtensilsName;
    }

    public String getKitchenUtensilsName() {
        return kitchenUtensilsName;
    }

    public void setKitchenUtensilsName(String kitchenUtensilsName) {
        this.kitchenUtensilsName = kitchenUtensilsName;
    }

}
