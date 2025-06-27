package de.hsruhrwest.oop.ss2025.praktikum10.a5;

public class ExamGrade {
    private long studentNumber;
    private double grade;

    public ExamGrade(long studentNumber, double grade) {
        this.studentNumber = studentNumber;
        this.grade = grade;
    }
    public long getStudentNumber() {
        return studentNumber;
    }
    public double getGrade() {
        return grade;
    }
}
