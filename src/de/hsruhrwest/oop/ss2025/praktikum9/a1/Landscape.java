package de.hsruhrwest.oop.ss2025.praktikum9.a1;

import java.io.*;
import java.util.stream.Collectors;

public class Landscape {
    public enum TileTypes {
        BEDROCK, WATER, SAND
    }

    private final int width;
    private final int height;
    private final TileTypes[][] tileTypes;

    public Landscape(int width, int height) {
        this.width = width;
        this.height = height;
        this.tileTypes = new TileTypes[width][height];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public TileTypes getTileType(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            throw new IllegalArgumentException("Die Koordinaten müssen innerhalb des Feldes liegen");
        }
        return tileTypes[x][y];
    }

    public void setTileType(int x, int y, TileTypes tileType) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            throw new IllegalArgumentException("Die Koordinaten müssen innerhalb des Feldes liegen");
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
                if (i == width - 1) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public void write (OutputStream out) throws IOException {
        out.write("landscape\n".getBytes());
        out.write((getWidth() + "x" + getHeight()).getBytes());
        out.write(toString().getBytes());
    }

    public void read (InputStream in) throws IOException {
        in.readAllBytes();
        String result = new BufferedReader(new InputStreamReader(in)).lines().collect(Collectors.joining("\n"));
    }
}