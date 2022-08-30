package List;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		int codigoProduto;
		int quantidadeProduto;		
		
		double valorProduto = 0;
		double valorTotal;
		double desconto;
		double valorTotalDesconto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Forneça o código e a quantidade do produto desejado: ");
		codigoProduto = sc.nextInt();
		quantidadeProduto = sc.nextInt();
		
		if (codigoProduto >= 1 && codigoProduto <= 10) {
			valorProduto = 10;
		}else
		if (codigoProduto >= 11 && codigoProduto <= 20) {
			valorProduto = 15;
		}else
		if (codigoProduto >= 21 && codigoProduto <= 30) {
			valorProduto = 20;
		}else
		if (codigoProduto >= 31 && codigoProduto <= 40) {
			valorProduto = 40;
		}else
			System.out.println("Você forneceu um código inválido.");
		
		valorTotal = valorProduto * quantidadeProduto;
		
	}
}
