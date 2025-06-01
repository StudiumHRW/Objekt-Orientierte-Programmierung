package de.hsruhrwest.oop.ss2025.praktikum6.a3;

public class Main {
    public static void main(String[] args) {
        var nodeA = new Node<>("A", 5);
        var nodeB = new Node<>("B", 2, nodeA);
        var nodeC = new Node<>("C", 1, nodeB);
        nodeC.print();
    }
}
