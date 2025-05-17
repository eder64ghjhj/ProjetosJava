package lista3;
import java.util.Scanner;
public class Exerc3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a base do retangulo");
	
	float base = sc.nextFloat();
	
	System.out.println("Digite a altura do retangulo");
	
	float altura = sc.nextFloat();
	
	float area = base*altura;
	
	System.out.println("A area do Retangulo é "+area);
	sc.close();

	}

}
