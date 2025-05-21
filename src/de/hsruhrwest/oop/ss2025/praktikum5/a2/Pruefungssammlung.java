package de.hsruhrwest.oop.ss2025.praktikum5.a2;

public class Pruefungssammlung {
    private Pruefung[] pruefungen;

    public Pruefungssammlung(Pruefung[] pruefung) {
        this.pruefungen = pruefung;
    }

    public Pruefung[] getPruefungen() {
        return pruefungen;
    }

    public int getAnzahlBetandenerPruefungen() {
        int anzahlBetandenerPruefungen = 0;
        for (Pruefung pruefung : pruefungen) {
            if (pruefung.isPassed()) {
                anzahlBetandenerPruefungen++;
            }
        }
        return anzahlBetandenerPruefungen;
    }

    public double getBestehensQuote() {
        return (double) getAnzahlBetandenerPruefungen() / pruefungen.length;
    }

    public int getAnzahlFührerscheinVersuche() {
        int anzahlTheorieVersuche = 0;
        boolean isPassed = false;
        for (Pruefung pruefung : pruefungen) {
            if (pruefung instanceof TheoretischeFuehrerscheinpruefung) {
                anzahlTheorieVersuche++;
                if (pruefung.isPassed()) {
                    isPassed = true;
                }
            }
        }
        if (isPassed) {
            return anzahlTheorieVersuche;
        } else {
            return 0;
        }
    }

    public int getAnzhalGeplatzerBallons() {
        int anzahlGeplatzerBallons = 0;
        for (Pruefung pruefung : pruefungen) {
            if (pruefung instanceof AufblasenVonLuftballons aufblasPruefung) {
                if (aufblasPruefung.getIsExploded()) {
                    anzahlGeplatzerBallons++;
                }
            }
        }
        return anzahlGeplatzerBallons;
    }

}

