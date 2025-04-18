package de.hsruhrwest.oop.ss2025.praktikum0;

public class OneOhOne {
	/**
	 * Computes and outputs the product of two integer numbers.
	 *
	 * @param i first number
	 * @param j second number
	 */
	public static void outputProduct(int i, int j) {
		int product = i * j;

		System.out.println(i + " * " + j + " = " + product);
	}

	/**
	 * Main program.
	 *
	 * @param args arguments
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				outputProduct(i, j);
			}
		}
	}
}
