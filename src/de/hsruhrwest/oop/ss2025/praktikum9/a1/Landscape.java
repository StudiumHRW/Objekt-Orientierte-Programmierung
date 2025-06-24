package de.hsruhrwest.oop.ss2025.praktikum9.a1;

import java.io.*;
import java.util.List;

/**
 * Repräsentiert eine Landschaft mit verschiedenen Kacheltypen.
 * Die Landschaft besteht aus einem zweidimensionalen Feld von Kacheln,
 * wobei jede Kachel einen bestimmten Typ (BEDROCK, WATER, SAND) hat.
 * Die Klasse bietet Methoden zum Lesen und Schreiben der Landschaft aus/in Streams.
 */
public class Landscape {
    /**
     * Enum für die verschiedenen Kacheltypen in der Landschaft.
     * BEDROCK: Felsgestein, dargestellt durch 'X'
     * WATER: Wasser, dargestellt durch '~'
     * SAND: Sand, dargestellt durch '.'
     */
    public enum TileTypes {
        BEDROCK, WATER, SAND
    }

    /** Die Breite der Landschaft. */
    private final int width;

    /** Die Höhe der Landschaft. */
    private final int height;

    /** Das zweidimensionale Array, das die Kacheltypen speichert. */
    private final TileTypes[][] tileTypes;

    /**
     * Konstruktor für eine neue Landschaft mit der angegebenen Breite und Höhe.
     * 
     * @param width Die Breite der Landschaft
     * @param height Die Höhe der Landschaft
     */
    public Landscape(int width, int height) {
        this.width = width;
        this.height = height;
        this.tileTypes = new TileTypes[width][height];
    }

    /**
     * Gibt die Breite der Landschaft zurück.
     * 
     * @return Die Breite der Landschaft
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gibt die Höhe der Landschaft zurück.
     * 
     * @return Die Höhe der Landschaft
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gibt den Kacheltyp an der angegebenen Position zurück.
     * 
     * @param x Die x-Koordinate der Kachel
     * @param y Die y-Koordinate der Kachel
     * @return Der Kacheltyp an der angegebenen Position
     * @throws IllegalArgumentException Wenn die Koordinaten außerhalb der Landschaft liegen
     */
    public TileTypes getTileType(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            throw new IllegalArgumentException("Die Koordinaten müssen innerhalb des Feldes liegen");
        }
        return tileTypes[x][y];
    }

    /**
     * Setzt den Kacheltyp an der angegebenen Position.
     * 
     * @param x Die x-Koordinate der Kachel
     * @param y Die y-Koordinate der Kachel
     * @param tileType Der zu setzende Kacheltyp
     * @throws IllegalArgumentException Wenn die Koordinaten außerhalb der Landschaft liegen
     */
    public void setTileType(int x, int y, TileTypes tileType) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            throw new IllegalArgumentException("Die Koordinaten müssen innerhalb des Feldes liegen. Größe: {" + width + ", " + height + "}. Koordinaten: {" + x + ", " + y + "}.");
        }
        tileTypes[x][y] = tileType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                String as = switch (getTileType(i, j)) {
                    case BEDROCK -> "X";
                    case WATER -> "~";
                    case SAND -> ".";
                };
                sb.append(as);
                // Es soll immer am Ende jeder Zeile ein New-Line ausgegeben werden.
                // In der letzten Zeile soll aber kein New-Line mehr stehen
                if (i == width - 1 && height - 1 != j) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public void write (OutputStream out) throws IOException {
        out.write("landscape\n".getBytes());
        out.write((getWidth() + "x" + getHeight() + "\n").getBytes());
        out.write(toString().getBytes());
    }

    public void read (InputStream in) throws InvalidFormatException {
        // Datei lesen und zeilenweise in eine Liste schreiben
        List<String> lines = new BufferedReader(new InputStreamReader(in)).lines().toList();
        // Die Datei muss mindestens "landscape" und die Größe enthalten, sonst ist die Datei ungültig
        if(lines.size() < 2) {
            throw new InvalidFormatException("Die Datei enthält nicht genug Zeilen. Metadaten fehlen");
        }
        // Die erste Zeile muss "landscape" lauten, sonst ist die Datei definitionsgemäß ungültig
        if(!lines.get(0).equals("landscape")) {
            throw new InvalidFormatException("Die Datei startet nicht mit \"landscape\".");
        }
        // Um die zweite Zeile zu verarbeiten, müssen wir Breite und Höhe getrennt verarbeiten. Deshalb Teilen wir die Zeile am x
        String[] size = lines.get(1).split("x");
        // Es muss genau zwei Seiten neben dem x geben. Links die Breite, rechts die Höhe. 2x3x2 wäre ungültig
        if(size.length != 2) {
            throw new InvalidFormatException("Höhe und Breite sind nicht korrekt formatiert");
        }
        try {
            int width = Integer.parseInt(size[0]);
            int height = Integer.parseInt(size[1]);
            // Muss die eingelesene Datei schon die richtige Größe haben, oder soll hier im Objekt die Größe dann angepasst werden?
            if(width != this.width || height != this.height) {
                throw new InvalidFormatException("Höhe und Breite stimmen nicht mit der Datei überein");
            }
        } catch (NumberFormatException e) {
            // Wenn links oder rechts neben dem x keine gültige Zahl steht ist die Datei auch ungültig
            // cddx23 wäre also ungültig
            throw new InvalidFormatException("Die Höhe und Breite sind keine gültigen Zahlen");
        }
        // Hier überprüfen wir, ob auch wirklich die richtige Anzahl Zeilen für die angegebene Höhe
        // in der Datei kodiert wurden. Die ersten zwei Zeilen sind Metadaten, also muss es zwei Zeilen mehr als die Höhe geben
        if(lines.size() < (height + 2)) {
            throw new InvalidFormatException("Die Daten in der Datei passen nicht zur spezifizierten Höhe. Die Datei hat " + lines.size() + " Zeilen, statt " + (width + 2));
        }
        for(int j = 2; j < lines.size(); j++) {
            String line = lines.get(j);
            // Jede Zeile muss auch die richtige Breite haben
            if(line.length() != width) {
                throw new InvalidFormatException("Die Daten in der Datei passen nicht zur spezifizierten Breite");
            }
            for(int i = 0; i < width; i++) {
                TileTypes type = getTileTypes(line.charAt(i));
                this.setTileType(i, j - 2, type);
            }
        }
        // Muss das Kachelarray geleert werden, wenn ein Fehler auftritt? So werden eventuell unvollständige Daten
        // gespeichert und alte Daten überschrieben
    }

    private static TileTypes getTileTypes(char c) throws InvalidFormatException {
        // Der Bereich mit den Feld-Daten darf nur gültige Daten enthalten. Auch Leerzeichen sind nicht erlaubt
        return switch(c) {
            case 'X' -> TileTypes.BEDROCK;
            case '~' -> TileTypes.WATER;
            case '.' -> TileTypes.SAND;
            default -> throw new InvalidFormatException("Die Datei enthält ungültige Daten. Es sind nur X, ~, . erlaubt. " + c + " wurde gefunden.");
        };
    }
}
