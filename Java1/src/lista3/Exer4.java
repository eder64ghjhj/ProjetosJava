package lista3;
import java.util.Scanner;
public class Exer4 {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do triângulo: ");
		double base = sc.nextDouble();
		
		System.out.println("Digite a altura do triâgulo: ");
		double altura = sc.nextDouble();
		
		double soma = base * altura /2;
		
		System.out.println("Area do triângulo: "+ soma );
		
		sc.close();
	}
}

