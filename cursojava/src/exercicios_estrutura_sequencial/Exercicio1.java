package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, soma;
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		soma = x + y;
		System.out.println("SOMA = " + soma);
	}
}
