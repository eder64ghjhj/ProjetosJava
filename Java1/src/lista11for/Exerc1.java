package lista11for;

public class Exerc1 {
    public static void main(String[] args) {
        System.out.println("Calcule a soma dos números de 1 ate 100");

        int acumuladora = 0;

        for (int numero = 1; numero < 101; numero++) {
            acumuladora = acumuladora + numero;

            System.out.println("Sua soma "+acumuladora);
        }
    }
}