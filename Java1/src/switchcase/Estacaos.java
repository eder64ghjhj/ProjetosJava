package switchcase;
import java.util.Scanner;
public class Estacaos {
  public static void main (String[]args) {
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("");
	  int estacao = sc.nextInt();
	  
	  switch (estacao) {
	  case 1:
		  System.out.println("primavera");
		  break;
	  case 2:
		  System.out.println("verao");
		  break;
	  case 3:
		  System.out.println("outono");
		  break;
	  case 4:
		  System.out.println("inverno");
		  break;
		  default:
			  System.out.println("Opcao invalida");
			  sc.close();
	  }
  }
}
