package lista1;
import java.util.Scanner;
public class RestoDaDivisao {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int numero2 = sc.nextInt();
		int quociente = numero1%numero2;
		int resto = numero1+numero2;
		System.out.println("O quociente é " + quociente);
		System.out.println("O resto da divisao é " + resto);
		sc.close();
		
	}

}
