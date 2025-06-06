package de.hsruhrwest.oop.ss2025.praktikum8.a2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonStatistics {
    private final List<Person> people;

    public PersonStatistics(List<Person> people) {
        this.people = people;
    }

    public void printYoungestAndOldestPerson() throws CouldNotCreateStatisticException {
        try {
            System.out.println("Die jüngste Person ist: " + getYougestPerson().toString());
            System.out.println("Die älteste Person ist: " + getOldestPerson().toString());
        } catch (EmptyListException | NonUniquePersonFoundException e) {
            throw new CouldNotCreateStatisticException(e);
        }
    }

    public Person getYougestPerson() throws NonUniquePersonFoundException, EmptyListException {
        if (people.isEmpty()) {
            throw new EmptyListException();
        }
        int minAge = getMinAge();
        Set<Person> youngestPersons = getPeopleWithAge(minAge);
        if (youngestPersons.isEmpty()) {
            return null;
        }
        if (youngestPersons.size() > 1) {
            throw new NonUniquePersonFoundException(minAge);
        }
        return youngestPersons.iterator().next();
    }

    public Person getOldestPerson() throws NonUniquePersonFoundException, EmptyListException {
        if (people.isEmpty()) {
            throw new EmptyListException();
        }
        int maxAge = getMaxAge();
        Set<Person> oldestPersons = getPeopleWithAge(maxAge);
        if (oldestPersons.isEmpty()) {
            return null;
        }
        if (oldestPersons.size() > 1) {
            throw new NonUniquePersonFoundException(maxAge);
        }
        return oldestPersons.iterator().next();
    }

    private Set<Person> getPeopleWithAge(int age) {
        Set<Person> peopleWithAge = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() == age) {
                peopleWithAge.add(person);
            }
        }
        return peopleWithAge;
    }

    private int getMinAge() {
        int minAge = Integer.MAX_VALUE;
        for (Person p : people) {
            int age = p.getAge();
            if (age < minAge) {
                minAge = age;
            }
        }
        return minAge;
    }

    private int getMaxAge() {
        int maxAge = Integer.MIN_VALUE;
        for (Person p : people) {
            int age = p.getAge();
            if (age > maxAge) {
                maxAge = age;
            }
        }
        return maxAge;
    }

    public static class EmptyListException extends Exception {

    }

    public static class NonUniquePersonFoundException extends Exception {
        private final int minAge;

        public NonUniquePersonFoundException(int minAge) {
            this.minAge = minAge;
        }

        public int getMinAge() {
            return minAge;
        }
    }

    public static class CouldNotCreateStatisticException extends Exception {
        public CouldNotCreateStatisticException(Exception e) {
            super(e);
        }
    }
}
