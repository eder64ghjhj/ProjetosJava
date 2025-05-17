package lista11for;
import java.util.Scanner;
public class Exerc5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero fatorial");
		
		int valor = sc.nextInt();
		int resultado =1;
		for (valor = valor; valor > 0;valor--) {
			
			
			resultado = resultado * valor;
			
			System.out.println(resultado);
		}

	}

}
