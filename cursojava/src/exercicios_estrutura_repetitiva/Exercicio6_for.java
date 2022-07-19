package exercicios_estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int qtdNotas = scanner.nextInt();
		
		for (int i = 0; i < qtdNotas; i++) {
			double nota1 = scanner.nextDouble();
			double nota2 = scanner.nextDouble();
			double nota3 = scanner.nextDouble();
		
			double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;
			System.out.printf("%.1f%n", media);
		}

	}

}
