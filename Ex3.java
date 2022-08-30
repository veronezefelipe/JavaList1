package List;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do salario base: ");
		double sal = sc.nextDouble();
		System.out.println("Informe a quantidade gastada: ");
		double kw = sc.nextDouble();
		
		sal = sal / 5;
		
		double conta;
		double desc;
		
		conta = sal * kw;
		desc = conta * 0.85;
		
		System.out.println("O quilowatt esta custando: " + sal + ". Sua conta é de: "+conta+" com desconto: "+desc);
	}
}
