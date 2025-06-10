package de.hsruhrwest.oop.ss2025.praktikum7.a2;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Justin", -100, Set.of("WoW", "Minecraft", "Ready or not"));
        Player p2 = new Player("Justus", -200, Set.of("Minecraft", "Ready or not"));
        Player p3 = new Player("Alex", 30, Set.of("LoL", "Minecraft"));
        Player p4 = new Player("Michael", 70, Set.of("WoW", "Minecraft", "Terraria"));
        Player p5 = new Player("Niklas", 100000, Set.of("WoW", "Fortnite"));

        PlayerDatabase db = new PlayerDatabase(List.of(p1, p2, p3, p4));
        db.remove("Michael");
        db.add(p5);

        System.out.println(db.getPlayers());

        System.out.println(db.getGameHistogram());

        System.out.println(db.getPlayersWithFavoriteGame("Minecraft"));

        System.out.println(db.getPlayersWithFavoriteGame("Fortnite"));

        db.sortPlayersByAmountOfFavoriteGames();
        System.out.println(db.getPlayers());

        db.sortPlayers();
        System.out.println(db.getPlayers());
    }
}
