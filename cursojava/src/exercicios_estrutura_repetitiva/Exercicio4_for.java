package exercicios_estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio4_for {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		for (int i = 0; i < x; i++) {
			if (i % 2==1) {
				System.out.println(i);
			}
		}
	}

}
