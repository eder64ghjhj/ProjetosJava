package lista3;
import java.util.Scanner;
public class Exerc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int valor = sc.nextInt();
		
		int antecessor = valor -1;
		
		System.out.println("O antecessor de "+valor+" é " +antecessor);
		sc.close();

	}

}
