package lista2;

import java.util.Scanner;

public class JurosCompostos {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do montante inicial");
		double capitalInicial = sc.nextDouble();
		System.out.println("Digite o valor dos juros anuais");
	    double jurosAnuais = sc.nextDouble();
		System.out.println("Digite o numero de anos ");
		int numeroAnos = sc.nextInt();
		double valorFinal = capitalInicial*Math.pow(1+jurosAnuais/100,numeroAnos);
		
		System.out.printf("O valor final é :%.2f" ,valorFinal);
		
	
		sc.close();
		
	
		
		
	}

}