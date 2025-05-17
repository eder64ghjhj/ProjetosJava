package switchcase;


import java.util.Scanner;

public class TipoDeTriangulo {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = scanner.nextDouble();
        scanner.close();
        
     int tipoTriangulo = 0; 

        
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            tipoTriangulo = -1;  
        } else if (lado1 == lado2 && lado2 == lado3) {
            tipoTriangulo = 1; 
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            tipoTriangulo = 2;
        } else {
            tipoTriangulo = 3; 
        }


        String resultado;
        switch (tipoTriangulo) {
            case 1:
                resultado = "Equilátero";
                break;
            case 2:
                resultado = "Isósceles";
                break;
            case 3:
                resultado = "Escaleno";
                break;
            case -1:
                resultado = "Os lados precisam ser maiores que zero.";
                break;
            default:
                resultado = "Erro desconhecido.";
        }

        
        System.out.println("O triângulo é: " + resultado);
    }
}

