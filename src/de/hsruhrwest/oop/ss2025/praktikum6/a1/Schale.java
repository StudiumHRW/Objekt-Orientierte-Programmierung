package de.hsruhrwest.oop.ss2025.praktikum6.a1;

public class Schale extends AbstractKitchenUtensils {
    private double volume;

    public Schale(String kitchenUtensilsName, double volume) {
        super(kitchenUtensilsName);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
