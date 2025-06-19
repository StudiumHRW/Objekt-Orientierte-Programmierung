package de.hsruhrwest.oop.ss2025.praktikum7.a2;

import java.util.Objects;
import java.util.Set;

public class Player implements Comparable<Player> {
    private String name;
    private int score;
    private Set<String> favoriteGames;

    public Player(String name, int score, Set<String> favoriteGames) {
        this.name = name;
        this.score = score;
        this.favoriteGames = favoriteGames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Set<String> getFavoriteGames() {
        return favoriteGames;
    }

    public void setFavoriteGames(Set<String> favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", favoriteGames=" + favoriteGames +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Player player)) return false;
        return score == player.score && Objects.equals(name, player.name) && Objects.equals(favoriteGames, player.favoriteGames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score, favoriteGames);
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(this.score, o.score);
    }
}
