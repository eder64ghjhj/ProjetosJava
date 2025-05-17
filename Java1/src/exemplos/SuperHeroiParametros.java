package exemplos;

public class SuperHeroiParametros {
	int idade;
	float altura,peso;
	
	
	public SuperHeroiParametros (int idadeSuperHeroi, float alturaSuperHeroi,float pesoSuperHeroi) {
		idade= idadeSuperHeroi;
		altura = alturaSuperHeroi;
		peso = pesoSuperHeroi;
	}
	public static void main(String[] args) {
		SuperHeroiParametros batman = new SuperHeroiParametros(18, 1.10f, 100f);
		System.out.println(batman.idade);
		System.out.println(batman.altura);
		System.out.println(batman.peso);
	}
}
