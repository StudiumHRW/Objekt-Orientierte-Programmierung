package de.hsruhrwest.oop.ss2025.praktikum5.a2;

public class Klausur extends Pruefung {
    private final int maxPoints;
    private int acquiredPoints;


    public Klausur(String name, int maxPoints, int acquiredPoints) {
        super(name);
        this.maxPoints = maxPoints;
        this.acquiredPoints = acquiredPoints;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public int getAcquiredPoints() {
        return acquiredPoints;
    }

    public void setAcquiredPoints(int acquiredPoints) {
        this.acquiredPoints = acquiredPoints;
    }

    @Override
    public String toString() {
        return this.getName() + " " + "(" + (acquiredPoints + " von " + maxPoints) + ")";
    }

    public boolean isPassed () {
        return acquiredPoints >= (maxPoints/2);
    }

}
