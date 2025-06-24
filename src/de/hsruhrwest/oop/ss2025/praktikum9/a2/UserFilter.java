package de.hsruhrwest.oop.ss2025.praktikum9.a2;

public interface UserFilter {
    /**
     * Allows testing a user against certain criteria
     * @param user
     * @return
     */
    boolean matches(User user);
}
