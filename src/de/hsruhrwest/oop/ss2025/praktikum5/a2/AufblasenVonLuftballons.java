package de.hsruhrwest.oop.ss2025.praktikum5.a2;

public final class AufblasenVonLuftballons extends Pruefung {
    private Integer volume;  //hier muss man eine Wapper klasse nutzen, weil der primitive datentyp int kein null annehmne kann
    private boolean isExploded;

    public AufblasenVonLuftballons(String name, Integer volume) {
        super(name);
        this.volume = volume;
        this.isExploded = volume == null;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getIsExploded() {
        return isExploded;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
        if(volume == null) {
            this.isExploded = false;
        }
    }

    public void setIsExploded(boolean isExploded) {
        this.isExploded = isExploded;
        if(isExploded) {
            this.volume = null;
        }
    }

    @Override
    public String toString() {
        return this.getName() + " Volumen: " + volume + " Ist es geplatzt?: " + isExploded;
    }

    public boolean isPassed() {
        return volume != null && volume >= 2;
    }

}
