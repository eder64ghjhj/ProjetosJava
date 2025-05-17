package lista7while;
import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		int contadora = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero pra saber a tabuada ate 10");
		int numero = sc.nextInt();
		
		while (contadora < 11) {
			System.out.println(numero+ "X" + contadora+ "=" + (numero*contadora));
			contadora++;
		}
		
		
		
		sc.close();

	}

}
