package List;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salario min;");
		double salMin = sc.nextDouble();
		
		System.out.println("Informe suas hrs trabalhadas");
		double hrsTrab = sc.nextDouble();
		
		double salRe;
		salRe = salMin / 2 * hrsTrab * 0.97;
		
		System.out.println("O salario a receber é: " + salRe);
	}
}
