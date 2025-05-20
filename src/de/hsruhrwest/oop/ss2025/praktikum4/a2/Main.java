package de.hsruhrwest.oop.ss2025.praktikum4.a2;

public class Main {
    public static void main(String[] args) {
        Zylinder zylinder1 = new Zylinder(10, 10,"Hurensohn");
        System.out.println("Volumen des Zylinders: " + zylinder1.volume());
        System.out.println("Oberflächeninhalt des Zylinders: " + zylinder1.surfaceArea());
        System.out.println();

        Kugel kugel1 = new Kugel(10,"Yellow");
        System.out.println("Voluemen der Kugel: " + kugel1.volume());
        System.out.println("Oberflächeninhalt der Kugel: " + kugel1.surfaceArea());
        System.out.println();

        Quader quader1 = new Quader(10, 10, 10, "Green");
        System.out.println("Volumen des Quders: "+ quader1.volume());
        System.out.println("Oberflächeninhalt des Quders: " + quader1.surfaceArea());

    }
}
