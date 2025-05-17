package lista3;


import java.util.Scanner;
public class Exerc12 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		 System.out.println("Digite a temperatura do  grau fahrenheit");
		 double fahrenheit = sc.nextDouble();
		 
		 double celsius =(5.0 / 9.0) * (fahrenheit - 32);
		 System.out.printf("A temperatura em Celsius é: %.2f° ", celsius);

		 sc.close(); 
	}

}