package exercicios_estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int coordenadaY = scanner.nextInt();
		int coordenadaX = scanner.nextInt();
		
		while (coordenadaX != 0 && coordenadaY != 0) {
			if (coordenadaX > 0 && coordenadaY > 0) {
				System.out.println("primeiro");
			}
			else if (coordenadaX < 0 && coordenadaY > 0) {
				System.out.println("segundo");
			}
			else if (coordenadaX < 0 && coordenadaY < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			
			coordenadaY = scanner.nextInt();
			coordenadaX = scanner.nextInt();
		}
	}

}
