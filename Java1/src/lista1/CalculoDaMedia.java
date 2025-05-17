package lista1;

import java.util.Scanner;
public class CalculoDaMedia {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int numero2 = sc.nextInt();
		System.out.println("Digite o terceiro");
		int numero3 = sc.nextInt();
		int resultado = (numero1+numero2+numero3)/3;
		System.out.println("A soma da media é " + resultado);
		sc.close();
		
		
	}

}
