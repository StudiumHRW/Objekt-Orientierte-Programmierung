package de.hsruhrwest.oop.ss2025.praktikum6;


public class Handy extends AbstractKitchenUtensils implements BatteriebetriebeneGeräte.BatterypoweredDevice {
    private String color;

    public Handy(String kitchenUtensilsName, String color) {
        super(kitchenUtensilsName);
        this.color = color;
    }

    @Override
    public double getRunTime(){
        return 24;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
