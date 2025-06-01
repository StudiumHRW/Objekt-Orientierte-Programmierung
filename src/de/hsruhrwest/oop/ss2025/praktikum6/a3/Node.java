package de.hsruhrwest.oop.ss2025.praktikum6.a3;

public class Node<T, N extends Number> {
    private T content;
    private N amount;
    private Node<T, N> parent;

    public Node(T content, N amount, Node<T, N> parent) {
        this.content = content;
        this.amount = amount;
        this.parent = parent;
    }

    public Node(T content, N amount) {
        this(content, amount, null);
    }

    public void print() {
        int sum = 0;
        int counter = 0;
        Node<T, N> current = this;
        while (current != null) {
            sum += current.getAmount().intValue();
            for(int i = 0; i < counter; i++) {
                System.out.print("  ");
            }
            System.out.println(current.getContent() + " (" + current.getAmount() + ")");

            counter++;
            current = current.getParent();
        }
        System.out.println("Total: " + sum);
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public N getAmount() {
        return amount;
    }

    public void setAmount(N amount) {
        this.amount = amount;
    }

    public Node<T, N> getParent() {
        return parent;
    }

    public void setParent(Node<T, N> parent) {
        this.parent = parent;
    }
}
