package exemplos;

public class Exemplo04String {

	public static void main(String[] args) {
		String texto = "Eder Daniel Viera";
		System.out.println("Para chegar ate a palavra Daniel sao : " + texto.indexOf("Daniel") + "caracteres.");
		System.out.println("Para chegar ate a palavra Vieira sao : " + texto.indexOf("Vieira") + "caracteres.");
		System.out.println(texto.trim());
	}

}
