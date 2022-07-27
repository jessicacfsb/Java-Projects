package javaUdemy;

public class trabalhandoStrings {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG  ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); //remove os espaços do começo e do final da string se tiver
		String s04 = original.substring(2); //deleta os 2 primeiros caracteeres e cria uma nova string com o que sobrou
		String s05 = original.substring(2, 9); //cria uma nova string apenas cm os elementos de indice 2, 3, 4, 5, 6, 7, 8 e 9
		String s06 = original.replace("a", "x"); //sempre que achar um a troca por um x (minusculo)
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc"); //primeira ocorrencia
		int j = original.lastIndexOf("bc");//ultima ocorrencia
		
		System.out.println("Original: " + original + "-");
		System.out.println("Minusculo: " + s01 + "-");
		System.out.println("Maiusculo: " + s02 + "-");
		System.out.println("Trim: " + s03 + "-");
		System.out.println("Substring(2): " + s04 + "-");
		System.out.println("Substring(2, 9): " + s05 + "-");
		System.out.println("Substituir: " + s06 + "-");
		System.out.println("Substituir strings: " + s07 + "-");
		System.out.println("Index Of bc: " + i);
		System.out.println("Last Index Of bc: " + j);
		
		System.out.println("");
		System.out.println("_____________________________________________");
		System.out.println("");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" "); //usar os espaços em branco como separador da string
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
