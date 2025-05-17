package switchcase;
import java.util.Scanner;
public class Calculadora {
 public static void main (String[]args) {
	 Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		int numero2 = sc.nextInt();
		int adicao = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;
	 System.out.println("Qual operacao deseja escolher");
	 System.out.println("Adicao");
	 System.out.println("Subtracao");
	 System.out.println("Multiplicacao");
	 System.out.println("Divisao");
	 
	 int opcao = sc.nextInt();
	 switch (opcao){
	 case 1:
		 System.out.println("voce escolheu a opcao adicao" + adicao);
		 break;
	 case 2:
		 System.out.println("voce escolheu a opcao subtracao" + subtracao);
		 break;
	 case 3:
		 System.out.println("voce escolheu a opcao multiplicacao" + multiplicacao);
		 break;
	 case 4:
		 System.out.println("voce escolheu a opcao divisao" + divisao);
	 }
	 sc.close();
 }
}