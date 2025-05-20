package de.hsruhrwest.oop.ss2025.praktikum5.a1;

public class Pet {
    private String owner;
    private int age;
    private String name;
    private String breed;
    private String color;

    public Pet(String owner, int age, String name, String breed, String color) {
        this.owner = owner;
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Pet: " + name + " (" + breed + ", " + color + ", " + age + "Years old)";
    }
}
