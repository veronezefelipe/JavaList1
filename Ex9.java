package List;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, i, j, fat;
		fat=1;
		
		System.out.print("Insira um número: ");
		num1 = sc.nextInt();
		System.out.print("Insira outro número: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			i=num1-1;
			j=num2;
		}
		else {
			i=num2-1;
			j=num1;
		}
		
		if(num1==num2) {
			System.out.println("Você digitou num iguais!");
		}
		else {
			for(; i>j; i--) {
				fat=fat*i;
			}
			System.out.println("Fatorial : " + num1 + " e " + num2 + " é: " + fat);
		}
	}
}
