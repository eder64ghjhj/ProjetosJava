package lista2;

import java.util.Scanner;
public class MediaHarmonica {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in); 
		 System.out.println("Digite o primeiro número:");
	    int numero1 = sc.nextInt();

	     System.out.println("Digite o segundo número:");
	     int numero2 = sc.nextInt();

	     System.out.println("Digite o terceiro número:");
	     int numero3 = sc.nextInt();

	     if (numero1 == 0 || numero2 == 0 || numero3 == 0) {
	         System.out.println("Erro! Os números nao podem ser  zero.");
	     } else {
	         double mediaHarmonica = 3 / (1.0 / numero1 + 1.0 / numero2 + 1.0 / numero3);
	         System.out.printf("A média harmônica é: %.2f\n", mediaHarmonica);
	     }

	     sc.close();
	}
}


