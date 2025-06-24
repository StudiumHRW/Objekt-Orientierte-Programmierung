package de.hsruhrwest.oop.ss2025.praktikum9.a2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printMatchingUsers(List<User> users, UserFilter filter) {
        users.stream().filter(filter::matches).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Tom", new User.Profile(345, LocalDate.now().minusDays(10))));
        users.add(new User("Julian", new User.Profile(345, LocalDate.now().minusWeeks(15))));
        users.add(new User("Angela", new User.Profile(345, LocalDate.now().minusYears(20))));
        users.add(new User("Austin", new User.Profile(345, LocalDate.now().minusDays(1))));
        users.add(new User("Jeffrey", new User.Profile(345, LocalDate.now().minusDays(100))));

        printMatchingUsers(users, user -> user.getProfile().getScore() > 300);
        printMatchingUsers(users, user -> user.getProfile().getMemberSince().isAfter(LocalDate.now().minusDays(100)));

        printMatchingUsers(users, new UserFilter() {
            @Override
            public boolean matches(User user) {
                return user.getProfile().getScore() > 300;
            }
        });
        printMatchingUsers(users, new UserFilter() {
            @Override
            public boolean matches(User user) {
                return user.getProfile().getMemberSince().isAfter(LocalDate.now().minusDays(100));
            }
        });
    }
}
