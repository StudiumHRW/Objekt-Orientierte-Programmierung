package de.hsruhrwest.oop.ss2025.praktikum8.a2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("George", 52, Person.Gender.MALE);
        Person p2 = new Person("Lukas", 8, Person.Gender.FEMALE);
        Person p3 = new Person("Star", 8, Person.Gender.MALE);
        Person p4 = new Person("Wars", 9, Person.Gender.FEMALE);
        Person p5 = new Person("Taylor", 43, Person.Gender.MALE);
        Person p6 = new Person("Swift", 31, Person.Gender.FEMALE);
        Person p7 = new Person("Angela", 77, Person.Gender.MALE);
        Person p8 = new Person("Merkel", 82, Person.Gender.FEMALE);
        Person p9 = new Person("Donald", 82, Person.Gender.MALE);
        Person p10 = new Person("Busch", 77, Person.Gender.FEMALE);
        
        testStatistic(new PersonStatistics(List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)));

        testStatistic(new PersonStatistics(List.of()));

        testStatistic(new PersonStatistics(List.of(p1, p2, p3)));

        testStatistic(new PersonStatistics(List.of(p7, p8, p9)));


    }

    private static void testStatistic(PersonStatistics statistics) {
        try {
            statistics.printYoungestAndOldestPerson();
        } catch (PersonStatistics.CouldNotCreateStatisticException e) {
            System.err.println("Fehler beim erstellen der Personen Statistic");
            System.err.println(e.getMessage());
        }
    }
}
