package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, d, diferenca;
		
		System.out.println("Digite 4 valores inteiros: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		
		diferenca = a*b-c*d;
		
		System.out.println("DIFERENCA = " + diferenca);
	}
}
