package lista2;

import java.util.Scanner;
public class AreaEPerimetroDoTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a largura do triangulo");
		double base = sc.nextDouble();
		System.out.println("Digite a altura do triangulo");
		double altura = sc.nextDouble();
	    double area = (base * altura) / 2;
	     System.out.println("A área do triângulo é: " + area); 
	        
	        System.out.println("Digite o primeiro lado do triangulo");
	        double lado1 = sc.nextDouble();
	        System.out.println("Digite o segundo lado do triangulo");
	        double lado2 = sc.nextDouble();
	        System.out.println("Digite o terceiro lado do triangulo");
	        double lado3 = sc.nextDouble();
	        double perimetro = lado1+lado2+lado3;
	        System.out.println("O perimetro do triangulo é " + perimetro);
	        sc.close();
	        

	}

}