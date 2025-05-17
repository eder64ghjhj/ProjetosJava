package lista1;

import java.util.Scanner;
public class AreaDoRetangulo{ 
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a largura do retangulo");
		double largura = sc.nextDouble();
		System.out.println("Digite a altura do retangulo");
		double altura = sc.nextDouble();
		double area = altura*largura;
		System.out.println("O Calculo da area do retangulo é " + area +"cm²");
		sc.close();
	}
}
