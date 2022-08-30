package List;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um num: ");
		int num = sc.nextInt();
		
		int i;
		boolean primo=true;
		for(i=2;i<= (num/2);i++) {
			if(num%i==0) {
				primo=false;
				break;
			}
		}
		
		if(primo){
			System.out.println("Eh primo!");
		}else {
			System.out.println("N eh primo!");
		}
	}
}
