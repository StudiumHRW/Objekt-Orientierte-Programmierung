package de.hsruhrwest.oop.ss2025.praktikum5.a1;

public class Dessert {
    private final String name;
    private final double price;
    private final int amount;
    private final String flavor;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getColor() {
        return color;
    }

    private final String color;

    public Dessert(String name, double price, int amount, String flavor, String color) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.flavor = flavor;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", flavor='" + flavor + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
