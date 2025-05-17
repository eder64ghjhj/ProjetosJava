package lista1;

import java.util.Scanner;
public class Subtracao {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primiero valor");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int numero2 = sc.nextInt();
		int resultado = numero1 - numero2;
		System.out.println("O resultado da Subtracao é " + resultado);
sc.close();
	}
}
