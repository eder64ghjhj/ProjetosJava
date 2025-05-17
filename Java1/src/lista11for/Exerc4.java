package lista11for;
import java.util.Scanner;
public class Exerc4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero = sc.nextInt();
		
		for (int tabuada = 1; tabuada  <=10; tabuada++) {
			System.out.println(numero + "X" + tabuada+ " = "+ (numero*tabuada));
		}
		sc.close();
	}

}
