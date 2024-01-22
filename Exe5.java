import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double numero;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número: ");
            numero = sc.nextDouble();

            if (numero > 0) {
                System.out.println("O número é positivo.");
            } else if (numero < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é igual a zero.");
            }
            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("O elemento informado não é um número!");
        }


    }
}
