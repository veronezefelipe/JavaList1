package List;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu salário base: ");
		double sal = sc.nextDouble();
		
		sal =  sal * 1.05 * 0.93;
		
		System.out.println("Seu salário a receber é de: " + sal);
	}
}
