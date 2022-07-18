package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite dois numeros inteiros: ");
		
		int numero1, numero2;
		
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();
		
		if (numero1 % numero2 ==0 || numero2 % numero1 ==0) {
			System.out.println("Sao Multiplos");	
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}

}
