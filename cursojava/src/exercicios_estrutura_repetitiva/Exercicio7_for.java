package exercicios_estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7_for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double resultado = 0;
		
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if (b != 0) {
				resultado = (double)a / b;
				System.out.printf("%.1f%n", resultado);
			}else {
				System.out.println("divisao impossivel");
			}
		}
	}

}
