package lista3;
import java.util.Scanner;
public class Exer7 {

	Scanner sc = new Scanner (System.in);
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    System.out.print("Digite a quantidade de anos: ");
	    int ano = sc.nextInt();
	        
	    System.out.print("Digite a quantidade de meses: ");
	    int meses = sc.nextInt();
	        
	    System.out.print("Digite a quantidade de dias: ");
	    int dias = sc.nextInt();

	    int idadeEmDias = ano * 365 + meses * 30 + dias;

	    System.out.println("A idade da pessoa em dias é: " + idadeEmDias);

	    sc.close();
	    }
	}

