package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int numero, horasTrabalhadas;
		double salarioHora, salario;
		
		numero = scanner.nextInt();
		horasTrabalhadas = scanner.nextInt();
		salarioHora = scanner.nextDouble();
		
		salario = horasTrabalhadas * salarioHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
	}

}
