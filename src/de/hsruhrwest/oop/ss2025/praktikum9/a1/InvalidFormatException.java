package de.hsruhrwest.oop.ss2025.praktikum9.a1;

/**
 * Is thrown when a loaded file has the wrong file format. Especially used for landscape files
 */
public class InvalidFormatException extends Exception {
    public InvalidFormatException(String message) {
        super(message);
    }

    public InvalidFormatException() {
        super();
    }
}
