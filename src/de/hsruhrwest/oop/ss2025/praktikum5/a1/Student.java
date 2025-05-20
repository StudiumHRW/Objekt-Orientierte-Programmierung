package de.hsruhrwest.oop.ss2025.praktikum5.a1;

import java.util.Arrays;

public class Student {
    private final String name;
    private final int age;
    private final String major;
    private final String[] courses;
    private final String gender;

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", major='" + major + '\'' + ", courses=" + Arrays.toString(courses) + ", gender='" + gender + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String[] getCourses() {
        return courses;
    }

    public String getGender() {
        return gender;
    }

    public Student(String name, int age, String major, String[] courses, String gender) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.courses = courses;
        this.gender = gender;
    }
}
