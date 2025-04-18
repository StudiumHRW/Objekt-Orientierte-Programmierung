package de.hsruhrwest.oop.ss2025.praktikum2;

import java.util.Scanner;

public class Inventory {
    private static final String[] inventory = new String[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.print("> ");
            String command = scanner.nextLine();

            String commandWord = command.contains(" ") ? command.substring(0, command.indexOf(' ')) : command;
            String commandParams = command.contains(" ") ? command.substring(command.indexOf(' ') + 1) : "";

            switch (commandWord.toLowerCase()) {
                case "exit" -> running = false;
                case "add" -> addItem(commandParams);
                case "remove" -> removeItem(commandParams);
                case "list" -> listItems();
                case "help" -> showHelp();
                default -> System.err.println("Invalid command");
            }
        }
    }

    private static void addItem(String item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                return;
            }
        }
        System.err.println("All slots are in use already. You may remove an item first");
    }

    private static void removeItem(String item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].equals(item)) {
                inventory[i] = null;
                return;
            }
        }
        System.err.println("You do not have this item in your inventory");
    }

    private static void listItems() {
        int usedSlots = 0;
        for (int i = 0; i < inventory.length; i++) {
            String item = inventory[i];
            if (item != null) {
                System.out.printf("[%d] \"%s\"\n", i + 1, item);
                usedSlots++;
            }
        }
        System.out.printf("%d/%d slots are used\n", usedSlots, inventory.length);
    }

    private static void showHelp() {
        System.out.println("Available commands:");
        System.out.println("add <item> -> Adds an item to the inventory if there is an empty slot");
        System.out.println("remove <item> -> Removes an item from the inventory");
        System.out.println("list -> Lists all items in the inventory and shows how much space is left");
        System.out.println("exit");
    }
}
