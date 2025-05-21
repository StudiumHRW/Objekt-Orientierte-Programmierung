package de.hsruhrwest.oop.ss2025.praktikum5.a2;

import java.util.Arrays;

public class TheoretischeFuehrerscheinpruefung extends Pruefung {
    private int[] errorPoints;


    public TheoretischeFuehrerscheinpruefung(String name, int[] errorPoints) {
        super(name);
        this.errorPoints = errorPoints;
    }

    public int[] getErrorPoints() {
        return errorPoints;
    }

    public void setErrorPoints(int[] errorPoints) {
        this.errorPoints = errorPoints;
    }

    @Override
    public String toString() {
        return this.getName() + " Fehlerpunkte: " + Arrays.toString(errorPoints);
    }

    public boolean isPassed() {
        int no5pointErrors = 0;
        int points = 0;
        for (int i = 0; i < errorPoints.length; i++) {
            if (errorPoints[i] == 5) {
                no5pointErrors++;
            }
            points += errorPoints[i];
            if (no5pointErrors >= 2) {
                return false;
            }
        }
        return points <= 10;
    }
}
