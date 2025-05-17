package lista1;

import java.util.Scanner;
public class NumeroDeUmQuadrado {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o numero do Quadrado");
		int numero = sc.nextInt();
		
		int quadrado = numero*numero;
		
		System.out.println("O numero do quudrado" + numero + " é " + quadrado);
		sc.close();
	}

}
