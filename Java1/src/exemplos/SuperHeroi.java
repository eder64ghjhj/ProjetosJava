package exemplos;

public class SuperHeroi {
	int idade;
	float altura,peso;
	
	
	public SuperHeroi () {
		idade= 5;
		altura = 80;
		peso = 200;
	}
	public static void main(String[] args) {
		SuperHeroi batman = new SuperHeroi();
		System.out.println(batman.idade);
		System.out.println(batman.altura);
		System.out.println(batman.peso);
	}
}
