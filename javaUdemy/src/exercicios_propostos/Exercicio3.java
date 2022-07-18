package exercicios_propostos;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A, B, C, D, diferenca;
		
		System.out.println("Digite 4 valores inteiros: ");
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		D = scanner.nextInt();
		
		diferenca = A*B-C*D;
		
		System.out.println("DIFERENCA = " + diferenca);
	}
}
