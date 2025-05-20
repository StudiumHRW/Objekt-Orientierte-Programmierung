package de.hsruhrwest.oop.ss2025.praktikum5.a1;

import java.util.Arrays;

public class PoliticalPartie {
    private String[] members;
    private String name;
    private String[] mainGoals;
    private final int yearFounded;
    private String[] leaders;

    public String[] getMembers() {
        return members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getMainGoals() {
        return mainGoals;
    }

    public void setMainGoals(String[] mainGoals) {
        this.mainGoals = mainGoals;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public String[] getLeaders() {
        return leaders;
    }

    public void setLeaders(String[] leaders) {
        this.leaders = leaders;
    }

    @Override
    public String toString() {
        return "PoliticalPartie{" +
                "members=" + Arrays.toString(members) +
                ", name='" + name + '\'' +
                ", mainGoals=" + Arrays.toString(mainGoals) +
                ", yearFounded=" + yearFounded +
                ", leaders=" + Arrays.toString(leaders) +
                '}';
    }

    public PoliticalPartie(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public PoliticalPartie(String[] members, String name, String[] mainGoals, int yearFounded, String[] leaders) {
        this.members = members;
        this.name = name;
        this.mainGoals = mainGoals;
        this.yearFounded = yearFounded;
        this.leaders = leaders;
    }
}
