package exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double area, raio, pi = 3.14159;
		
		raio = scanner.nextDouble();
		
		area = pi * raio * raio;
		System.out.printf("A = %.4f%n", area);
	}

}
