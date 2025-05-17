package lista3;
import java.util.Scanner;

public class Exerc9 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();
        
    
        System.out.print("Digite o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();
        
     
        double reajuste = salarioAtual * (percentualReajuste / 100);
        
        
        double novoSalario = salarioAtual + reajuste;
        
     
        System.out.println("O novo salário do funcionário é: " + novoSalario);
        
    
        scanner.close();
    }
}
