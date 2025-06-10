package de.hsruhrwest.oop.ss2025.praktikum8.a2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * An Utility class to generate statistics about a list of players
 */
public class PersonStatistics {
    private final List<Person> people;

    public PersonStatistics(List<Person> people) {
        this.people = people;
    }

    /**
     * Berechnet die jüngste und die älteste Person der Liste
     * @throws CouldNotCreateStatisticException -> Wenn die Liste leer ist oder es keine Eindeutige jüngste oder älteste Person gibt
     */
    public void printYoungestAndOldestPerson() throws CouldNotCreateStatisticException {
        try {
            System.out.println("Die jüngste Person ist: " + getYougestPerson().toString());
            System.out.println("Die älteste Person ist: " + getOldestPerson().toString());
        } catch (EmptyListException | NonUniquePersonFoundException e) {
            throw new CouldNotCreateStatisticException(e);
        }
    }

    /**
     *
     * @return die jüngste Person aus der Liste
     * @throws NonUniquePersonFoundException -> Wenn die jüngste Person nicht eindeutig ist (zwei Personen das gleiche Alter haben)
     * @throws EmptyListException -> Wenn die Liste leer ist
     */
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

    /**
     *
     * @return die älteste Person aus der Liste
     * @throws NonUniquePersonFoundException -> Wenn die älteste Person nicht eindeutig ist (zwei Personen das gleiche Alter haben)
     * @throws EmptyListException -> Wenn die Liste leer ist
     */
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

    /**
     * Filtert die Liste nach allen Personen die das angegebene Alter haben
     *
     * @param age -> the age to filter for
     * @return -> A Set of all persons with the specified age
     */
    private Set<Person> getPeopleWithAge(int age) {
        Set<Person> peopleWithAge = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() == age) {
                peopleWithAge.add(person);
            }
        }
        return peopleWithAge;
    }

    /**
     *
     * @return -> The age of the youngest person
     */
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

    /**
     *
     * @return the age of the oldest person
     */
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

    /**
     * Is thrown when a the list is empty and a statistic is attempted to be calculated
     */
    public static class EmptyListException extends Exception {

    }

    /**
     * Is thrown when the oldest or the youngest in the list is not unique
     */
    public static class NonUniquePersonFoundException extends Exception {
        private final int age;

        public NonUniquePersonFoundException(int age) {
            this.age = age;
        }

        /**
         *
         * @return -> The age of which there are multiple persons in the set
         */
        public int getAge() {
            return age;
        }
    }

    /**
     * A wrapper exception for NonUniquePersonFoundException or EmptyListException
     */
    public static class CouldNotCreateStatisticException extends Exception {
        public CouldNotCreateStatisticException(Exception e) {
            super(e);
        }
    }
}
