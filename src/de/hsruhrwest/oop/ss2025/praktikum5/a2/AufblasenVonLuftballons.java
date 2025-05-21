package de.hsruhrwest.oop.ss2025.praktikum5.a2;

public final class AufblasenVonLuftballons extends Pruefung {
    private Integer volume;  //hier muss man eine Wapper klasse nutzen, weil der primitive datentyp int kein null annehmne kann
    private boolean isExploded;

    public AufblasenVonLuftballons(String name, int volume, boolean isExploded) {
        super(name);
        this.volume = volume;
        this.isExploded = isExploded;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getIsExploded() {
        return isExploded;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setIsExploded(boolean isExploded) {
        this.isExploded = isExploded;
    }

    @Override
    public String toString() {
        return this.getName() + " Volumen: " + volume + " Ist es geplatzt?: " + isExploded;
    }

    public boolean isPassed() {
        return volume != null && volume >= 2;
    }

}
