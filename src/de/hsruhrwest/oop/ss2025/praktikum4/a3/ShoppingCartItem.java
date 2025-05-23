package de.hsruhrwest.oop.ss2025.praktikum4.a3;

public class ShoppingCartItem {
    private final String name;
    private final double price;
    private final int amount;


    public ShoppingCartItem(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return price * amount;
    }

    public int getAmount() {
        return amount;
    }
}
