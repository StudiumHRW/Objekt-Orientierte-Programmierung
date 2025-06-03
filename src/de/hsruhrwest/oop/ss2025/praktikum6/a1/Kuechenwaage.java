package de.hsruhrwest.oop.ss2025.praktikum6.a1;

public class Kuechenwaage extends AbstractKitchenUtensils implements BatterypoweredDevice {
    private double maxWeight;

    public Kuechenwaage(String kitchenUtensilsName, double maxWeight) {
        super(kitchenUtensilsName);
        this.maxWeight = maxWeight;
    }

    public double getRunTime() {
        return 8760;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
}
