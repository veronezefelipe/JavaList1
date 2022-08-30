package List;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n = 0;
		double cubo = 0, raiz = 0;
		int cont = 0;
		
		System.out.println("Digite um num:");
		System.out.printf("%10s %10s %10s", "Número", "Cubo", "Raiz");
		
		do {
			n = sc.nextDouble();
			cubo = Math.pow(n, 3);
			raiz = Math.sqrt(n);
			
			System.out.printf("%10.2f %10.2f %10.2f", n, cubo, raiz);
			
			cont ++;
			if(cont == 20) {
				System.out.print("\n");
				System.out.printf("%10s %10s %10s", "Número", "Cubo", "Raiz");
				cont = 0;
			}
		}while(n > 0);
		
	}
}
