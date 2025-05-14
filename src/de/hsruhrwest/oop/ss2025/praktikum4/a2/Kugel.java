package de.hsruhrwest.oop.ss2025.praktikum4.a2;

public class Kugel {
    public int radius;
    public String color;

    public Kugel(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Kugel() {
        this(1, "red");
    }

    public double surfaceArea() {
        return 4 * Math.PI * (radius * radius);
    }

    public double volume() {
        return (4.0/3.0) * Math.PI * (radius * radius * radius);
    }
}
