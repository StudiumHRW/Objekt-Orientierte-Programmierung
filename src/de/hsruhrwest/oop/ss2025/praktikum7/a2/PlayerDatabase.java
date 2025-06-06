package de.hsruhrwest.oop.ss2025.praktikum7.a2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PlayerDatabase {
    private final ArrayList<Player> players;

    public PlayerDatabase(ArrayList<Player> players) {
        this.players = players;
    }

    public void add(Player player) {
        players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void remove(String searchString) {// Wie soll hier ein Iterator verwendet werden?
        players.removeIf(player -> player.getName().toLowerCase().contains(searchString.toLowerCase()));
        /*
        for (Player player : players) {
            if (player.getName().toLowerCase().contains(searchString.toLowerCase())) {
                players.remove(player);
            }
        }
        */
    }

    public Set<Player> getPlayersWithFavoriteGame(String game) {
        return players.stream().filter(player -> player.getFavoriteGames().contains(game)).collect(Collectors.toSet());
    }

    public void sortPlayers() {
        this.players.sort(Player::compareTo);
    }

    public void sortPlayersByAmountOfFavoriteGames() {
        this.players.sort(new PlayerComparator());
    }

    public Map<String, Long> getGameHistogram() {
        Map<String, Long> map = new HashMap<>();
        for(Player player : players) {
            for (String game : player.getFavoriteGames()) {
                map.put(game, map.getOrDefault(game, 0L) + 1);
            }
        }
        return map;
    }
}
