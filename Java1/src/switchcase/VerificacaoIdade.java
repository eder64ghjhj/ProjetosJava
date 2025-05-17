package switchcase;
import java.util.Scanner;


public class VerificacaoIdade{
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

    
        scanner.close();

       
        int categoria = -1; 

    
        if (idade >= 0 && idade <= 12) {
            categoria = 1; 
        } else if (idade >= 13 && idade <= 17) {
            categoria = 2; 
        } else if (idade >= 18 && idade <= 59) {
            categoria = 3; 
        } else if (idade >= 60) {
            categoria = 4;
        }

        switch (categoria) {
            case 1:
                System.out.println("Sua categoria é: Criança");
                break;
            case 2:
                System.out.println("Sua categoria é: Adolescente");
                break;
            case 3:
                System.out.println("Sua categoria é: Adulto");
                break;
            case 4:
                System.out.println("Sua categoria é: Idoso");
                break;
            default:
                System.out.println("Idade inválida");
                break;
        }
    }
}

