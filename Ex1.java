package List;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	int i = 0;
	
	int[] vet = new int[3];
	int[] vet2 = new int[3];
	
	for (i = 0; i < vet.length; i++) {
		System.out.print("Informe o angulo: ");
		vet[i] = sc.nextInt();
	}
	
	for (i = 0; i < vet.length; i++) {
		System.out.print("Informe o lado: ");
		vet2[i] = sc.nextInt();
	}
	
	if((vet[0]) == 90 || (vet[1]) == 90 || (vet[2]) == 90) {
		System.out.println("O triangulo eh retangulo");
	}else if((vet[0]) > 90 || (vet[1]) > 90 || (vet[2]) > 90) {
		System.out.println("O tringulo eh obtusangulo");
	}else if((vet[0]) < 90 && (vet[1]) < 90 && (vet[2]) < 90) {
		System.out.println("O tringulo eh acutangulo");
	}
	
	if(vet2[0] == vet2[1] && vet2[0] == vet2[2]) {
		System.out.println("O trinagulo eh equilatero");
	}else if(vet2[0] != vet2[1] && vet2[0] != vet2[2] && vet2[1] != vet2[2]) {
		System.out.println("O triangulo eh escaleno");
	}else if(vet2[0] == vet2[1] || vet2[0] == vet2[2] || vet2[1] == vet2[2]) {
		System.out.println("O tringulo eh isosceles");
	}
	
	}
}