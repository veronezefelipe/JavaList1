package List;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = sc.nextInt();
		
		int fat = num;
		
		while (num > 1){
			  fat = fat *(num-1); 
			  num--;
		} 
		
		System.out.println("O fatorial deste número é: "+fat);
	}
}
