package exemplos;
import java.util.Scanner;
public class Temporizador {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a hora");
		int hora = sc.nextInt();
		System.out.println("Digite os minutos");
		int minuto = sc.nextInt();
		System.out.println("Digite os segundos");
		int segundos = sc.nextInt();
		
		for (hora=hora; hora > -1; hora--) {
			for (minuto = minuto; minuto >-1; minuto--) {
				for (segundos = segundos; segundos >-1; segundos--) {
					
					System.out.println(hora+ " : "+minuto+ " : "+segundos);
				}
				segundos = 59;
			}
			minuto = 59;
		}

	}

}
