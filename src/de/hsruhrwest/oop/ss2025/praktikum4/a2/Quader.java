package de.hsruhrwest.oop.ss2025.praktikum4.a2;

public class Quader {
    public double height;
    public double width;
    public double depth;
    public String color;


    public Quader(double height, double width, double depth, String color) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.color = color;

    }

    public Quader() {
        this(20,10,15, "Yellow");
    }

    public double surfaceArea() {
        return 2 * height * depth + 2 * height * width + 2 * width * depth;
    }

    public double volume () {
        return height * width * depth;
    }
}

