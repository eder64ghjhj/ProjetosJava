package lista3;
import java.util.Scanner;
public class Exerc2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int valor = sc.nextInt();
		
		int sucessor = valor +1;
		
		System.out.println("O antecessor de "+valor+" é " +sucessor);
		sc.close();

	}

}
