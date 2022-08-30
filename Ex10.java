package List;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				int totalPrimos=0;
				int i;
				int j;
				for(i=0;i<10;i++) {
					System.out.println("Digite um número:");
					int num = sc.nextInt();
					boolean primo=true;
					for(j=2;j<= (num/2);j++) {
						if(num%j==0) {
							primo=false;
							break;
						}
					}
					if(primo)
						totalPrimos++;
				}
				
				System.out.println("Total de primos: "+totalPrimos);
			}
		}
	
