package exercicios_estrutura_repetitiva;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio5_for {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int dentro = 0, fora = 0;
		
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if(x>=10 && x<=20) {
				dentro += 1;
			}else {
				fora += 1;
			}
		}
		
		System.out.println(dentro + " in");
		System.out.println(fora + " out");

	}

}
