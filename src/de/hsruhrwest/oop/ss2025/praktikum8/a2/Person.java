package de.hsruhrwest.oop.ss2025.praktikum8.a2;

public class Person {
    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String name, int age, Gender gender) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        this.name = name;
        if(age < 0) {
            throw new IllegalArgumentException("Age must be a positive integer");
        }
        this.age = age;
        if(gender == null) {
            throw new IllegalArgumentException("Gender must not be null");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public enum Gender {
        MALE, FEMALE, DIVERSE;
    }
}
