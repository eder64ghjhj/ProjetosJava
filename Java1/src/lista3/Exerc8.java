package lista3;
import java.util.Scanner;
public class Exerc8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numero de Eleitores");
		
		int totalEleitores = sc.nextInt();
		
		System.out.println("Digite o numero de votos Brancos");
		
		int votosBrancos = sc.nextInt();
		
		System.out.println("Digite o numero de votos nulos");
		
		int votosNulos = sc.nextInt();
		
		System.out.println("Digite o numero de votos validos");
		
		int votosValidos = sc.nextInt();
		
		double porcentoBranco = (double) votosBrancos/totalEleitores * 100;
		
		double porcentoNulo = (double) votosNulos/totalEleitores * 100;
		
		double porcentoValido = (double) votosValidos/totalEleitores * 100;
		
		System.out.println("A porcentagem dos votos Brancos sao:%.2f%%\\n "+porcentoBranco);
		System.out.println("A porcentagem dos votos nulos sao:%.2f%%\\n "+porcentoNulo);
		System.out.println("A porcentagem dos votos validos sao:%.2f%%\\n "+porcentoValido);
		sc.close();
	}

}
