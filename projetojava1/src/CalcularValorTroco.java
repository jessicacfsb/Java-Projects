import java.util.Scanner;

public class CalcularValorTroco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do Produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade de produtos: ");
		Double totalCompra = scanner.nextDouble();
		
		System.out.print("Quanto o cliente pagou: ");
		Double formaPagamento = scanner.nextDouble();
		
		Double resultado = formaPagamento - (totalCompra * valorProduto);
		
		System.out.println("Troco: " + resultado);
		
		scanner.close();
	}
}