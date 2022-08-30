package List;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contMen = 0, j=0, i=0, somaId=0, somaAlt=0;
		double pesoMai=0, mediaId, mediaAlt, porPe ;
		
		for(j=0;j<5;j++) {
			somaId = 0;
			for(i=0;i<11;i++) {
				System.out.println("Informe a idade do jogador " + (i+1));
				int idade = sc.nextInt();
				System.out.println("Informe a altura do jogador(em cm) " + (i+1));
				int altura = sc.nextInt();
				System.out.println("Informe o peso do jogador(em m) " + (i+1));
				double peso = sc.nextDouble();
				
				somaId = somaId + idade;
				somaAlt = somaAlt + altura;
				
				if(idade < 18) {
					contMen++;
				}
				if(peso > 80) {
					pesoMai++;
				}
			
			}
			mediaId = somaId / 11;
			System.out.println("O time "+(j+1)+" tem média de idade igual a: "+mediaId);
		}
		mediaAlt = somaAlt / 5;
		porPe = pesoMai * 100 / 5;
		
		System.out.println("Um total de "+contMen+" jogador(es) são menores de idade.");
		System.out.println("A média das alturas é de: "+mediaAlt);
		System.out.println("A porcentagem de jogares com mais de 80kg é de "+porPe+"%");
		
	}
}
