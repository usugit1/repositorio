package aula1;

import java.util.Scanner;

public class ExemploJava {
	// Programa para calcular a �rea de um c�rculo.
	public static void main(String[] args) {
        double raio;
        double area;
        final double pi = 3.14;

        System.out.print("Informe o raio do c�rculo: ");

        Scanner r = new Scanner(System.in);
        raio = r.nextDouble();
        r.close();

        area = pi * Math.pow(raio, 2);

        System.out.println("A �rea do c�rculo �: " + area);
	}
}