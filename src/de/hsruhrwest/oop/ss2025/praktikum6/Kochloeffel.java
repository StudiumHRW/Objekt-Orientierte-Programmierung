package de.hsruhrwest.oop.ss2025.praktikum6;

public class Kochloeffel extends AbstractKitchenUtensils {
    private String material;

    public Kochloeffel(String kitchenUtensilsName, String material) {
        super(kitchenUtensilsName);
        this.material = material;
    }

    public String getMetarial() {
        return material;

    }

    public void setMetarial(String material) {
        this.material = material;
    }


}
