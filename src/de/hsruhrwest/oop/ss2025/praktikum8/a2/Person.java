package de.hsruhrwest.oop.ss2025.praktikum8.a2;

/**
 * A Person has a name, an age and a gender. All attributes are mandatory. Age must be positive
 */
public class Person {
    private final String name;
    private final int age;
    private final Gender gender;

    /**
     *
     * @param name @NotNull and not empty
     * @param age must be positive
     * @param gender @NotNull
     *
     * @throws IllegalArgumentException
     */
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

    /**
     *
     * @return String -> get Persons Name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return int -> get the persons age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @return Gender -> the persons gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     *
     * @return String -> Contains all attributes in key-value pairs
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    /**
     * an Enumeration of possible genders
     */
    public enum Gender {
        MALE, FEMALE, DIVERSE;
    }
}
