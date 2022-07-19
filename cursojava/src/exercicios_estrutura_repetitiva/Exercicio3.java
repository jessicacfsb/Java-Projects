package exercicios_estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (numero != 4) {
			if (numero == 1) {
				alcool += 1;
			}else if (numero == 2) {
				gasolina += 1;
			}else if (numero == 3) {
				diesel += 1;
			}
				numero = scanner.nextInt();
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina:" + gasolina);
		System.out.println("Diesel: " + diesel);
		
	}

}
