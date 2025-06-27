package de.hsruhrwest.oop.ss2025.praktikum10.a5;

import java.util.List;

public class Exam {
    private String name;
    private List<ExamGrade> grades;

    public Exam(String name, List<ExamGrade> grades) {
        this.name = name;
        this.grades = grades;
    }

    public List<ExamGrade> getGrades() {
        return grades;
    }
}
