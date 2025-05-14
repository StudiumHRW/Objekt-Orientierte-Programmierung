package de.hsruhrwest.oop.ss2025.praktikum4.a2;


public class Zylinder {
    public double height;
    public double radius;
    public String color;

    public Zylinder() {
        this(5, 2.5, "blue");
    }

    public Zylinder(double height, double radius, String color) {
        this.height = height;
        this.radius = radius;
        this.color = color;
    }


    public double surfaceArea() {
        return (2 * Math.PI * (radius * radius)) + (2 * Math.PI * radius * height);
    }

    public double volume() {
        return Math.PI * (radius * radius) * height;
    }

}
