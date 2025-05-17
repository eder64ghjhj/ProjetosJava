package switchcase;

import java.util.Scanner;

public class VerificacaoMesEEstacao {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mes Do Ano");
		int mes = sc.nextInt();
		
		String nomeMes = "";
		String estacao = "";
		
		switch (mes) {
		case 1:
			nomeMes = "Janeiro";
			estacao = "verao";
			break;
		case 2:
			nomeMes = "Fevereiro";
			estacao = "verao";
			break;
		case 3:
			nomeMes = "Marco";
			estacao = "outono";
			break;
		case 4:
			nomeMes = "Abril";
			estacao = "outono";
			break;
		case 5 :
			nomeMes = "Maio";
			estacao = "outono";
			break;
		case 6:
			nomeMes = "Junho";
			estacao = "inverno";
			break;
		case 7 :
			nomeMes = "Julho";
			estacao = "inverno";
			break;
		case 8 :
			nomeMes = "Agosto";
			estacao = "inverno";
			break;
		case 9:
			nomeMes = "Setembro";
			estacao = "primavera";
			break;
		case 10:
			nomeMes = "Outubro";
			estacao = "primavera";
			break;
		case 11:
			nomeMes = "Novembro";
			estacao = "primavera";
			break;
		case 12:
			nomeMes = "Dezembro";
			estacao = "verao";
			break;
			default:
				System.out.println("Mes invalido,digite um numero de 1 a 12");
				
		}
		System.out.println("O mês é: " + nomeMes);
        System.out.println("A estação correspondente é: " + estacao);
		sc.close();
}
}