package de.hsruhrwest.oop.ss2025.praktikum9.a2;

import java.time.LocalDate;

public class User {
    private String name;
    private Profile profile;

    public User(String name, Profile profile) {
        this.name = name;
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", profile=" + profile +
                '}';
    }

    public static class Profile {
        private int score;
        private LocalDate memberSince;

        public Profile(int score, LocalDate memberSince) {
            this.score = score;
            this.memberSince = memberSince;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public LocalDate getMemberSince() {
            return memberSince;
        }

        public void setMemberSince(LocalDate memberSince) {
            this.memberSince = memberSince;
        }

        @Override
        public String toString() {
            return "Profile{" +
                    "score=" + score +
                    ", memberSince=" + memberSince +
                    '}';
        }
    }
}
