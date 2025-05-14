package de.hsruhrwest.oop.ss2025.praktikum4.a3;

public class ShoppingCardItem2 {
    private final String name;
    private final double totalPrice;
    private final int amount;


    public ShoppingCardItem2(String name, double price, int amount) {
        this.name = name;
        this.totalPrice = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getPrice() {
        return totalPrice / amount;
    }

    public int getAmount() {
        return amount;
    }
}
