package de.hsruhrwest.oop.ss2025.praktikum6.a1;

public class Puerierstab extends AbstractKitchenUtensils implements ElectricalDevice, DangerousDevice {
    private double maxPower;

    public Puerierstab(String kitchenUtensilsName, double maxPower) {
        super(kitchenUtensilsName);
        this.maxPower = maxPower;
    }

    public double getEnergyConsumption() {
        return 250; //Watt
    }

    public int getAgeRequirement() {
        return 12;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }
}

