package de.hsruhrwest.oop.ss2025.praktikum4.a3;

public class ShoppingCart {
    private ShoppingCartItem[] items;
    private final String name;
    private static final String DEFAULT_NAME = "Shopping Cart";

    public ShoppingCart(ShoppingCartItem[] items, String name) {
        this.items = items;
        this.name = name;
    }

    public ShoppingCart(ShoppingCartItem[] items) {
        this.items = items;
        this.name = DEFAULT_NAME;
    }

    public int getNumberOfItems() {
        return items.length;
    }

    public void clearShoppingCart() {
        items = new ShoppingCartItem[0];
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (ShoppingCartItem item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
