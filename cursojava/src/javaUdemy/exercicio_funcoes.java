package javaUdemy;

import java.util.Scanner;

public class exercicio_funcoes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite tres numeros: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		// forma com if
		/*if (a > b && a > c) {
			System.out.println("Maior = " + a);
		}else if(b > a && b > c) {
			System.out.println("Maior = " + b);
		}else {
			System.out.println("Maior = " + c);
		}*/
		
		//foorma com função
		int maior = max(a, b, c);
		showResult(maior);
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Maior = " + value);
	}
}
