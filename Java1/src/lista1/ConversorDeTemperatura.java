package lista1;

import java.util.Scanner;
public class ConversorDeTemperatura {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		 System.out.println("Digite a temperatura do  grau celsius");
		 double celsius = sc.nextDouble();
		 
		 double fahrenheit = (celsius * 9/5) +32;
		 System.out.println("A temperatura em Fahrenheit é " + fahrenheit);
		 sc.close(); 
	}

}
