package lista3;
import java.util.Scanner;
public class Exerc10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo da fabrica de carro");
		int custoFabrica = sc.nextInt();
		
		double porcentualDistribuidor = 28.0;
		double porcentualImposto = 45.0;
		
		double valorDistribuidor = custoFabrica *(porcentualDistribuidor / 100);
		double valorImposto = custoFabrica * porcentualImposto / 100;
		
		double valorFinal = custoFabrica+valorDistribuidor+valorImposto;
		
		System.out.println("O custo final ao consumidor é " +valorFinal);
		sc.close();

	}

}
