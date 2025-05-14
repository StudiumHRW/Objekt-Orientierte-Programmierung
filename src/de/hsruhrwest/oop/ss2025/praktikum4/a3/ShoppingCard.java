package de.hsruhrwest.oop.ss2025.praktikum4.a3;

public class ShoppingCard {
    private ShoppingCardItem[] items;
    private final String name;

    public ShoppingCard(ShoppingCardItem[] items, String name) {
        this.items = items;
        this.name = name;
    }

    public ShoppingCard(ShoppingCardItem[] items) {
        this(items, "ShoppingCard");
    }

    public int getNumberOfItems() {
        return items.length;
    }

    public void clearShoppingCard() {
        items = new ShoppingCardItem[0];
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (ShoppingCardItem item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
