package aula1;

import java.util.Scanner;

public class ExemploJava {
	// Programa para calcular a área de um círculo.
	public static void main(String[] args) {
        double raio;
        double area;
        final double pi = 3.14;

        System.out.print("Informe o raio do círculo: ");

        Scanner r = new Scanner(System.in);
        raio = r.nextDouble();
        r.close();

        area = pi * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);
	}
}