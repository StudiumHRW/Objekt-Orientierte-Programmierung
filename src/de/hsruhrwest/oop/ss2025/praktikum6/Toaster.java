package de.hsruhrwest.oop.ss2025.praktikum6;

public class Toaster extends AbstractKitchenUtensils implements ElektronischeGeräte.electricalDevice {
    private double energyConsumption;

    public Toaster(String kitchenUtensilsName, String material) {
        super(kitchenUtensilsName);
        this.energyConsumption = energyConsumption;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

}
/* witzige Situation, hier habe ich beim erstellen der Klasse toaster enegryconsuption als Attribut gewählt,
beim implementieren der elektoschengeräte musste ich getEnergyConsumption als attribut einfügen.
ich lass das extra so, zum vorstellen. Man könnte auch beim toaser als Attribut was anderes nehmen können.
 */