package de.hsruhrwest.oop.ss2025.praktikum7.a2;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getFavoriteGames().size() - o2.getFavoriteGames().size();
    }
}
