package de.hsruhrwest.oop.ss2025.praktikum10.a5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Helpers {
    public static int getTotalStudents(List<Exam> grades) {
        return grades.stream().mapToInt(e -> e.getGrades().size()).sum();
    }

    public static long getNumberOfPassedGrades(ExamGrade[] grades) {
        return Arrays.stream(grades).map(grade -> grade.getGrade() <= 4.0).count();
    }

    public static boolean containsGradeBetterThan(Exam exam, ExamGrade grade) {
        return exam.getGrades().stream().filter(g -> g.getGrade() < grade.getGrade()).count() > 1;
    }

    public static List<Long> getAllPassedStudentNumbers(List<Exam> grades) {
        return grades.stream().flatMap(grade ->
                grade.getGrades().stream().map(ExamGrade::getStudentNumber)
        ).collect(Collectors.toList());
    }
}
