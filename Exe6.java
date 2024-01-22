import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float numeros, media, soma;
        numeros = media = soma = 0;

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 0; i < 3; i++) {
                System.out.printf("Digite o %dº número: ", i + 1);
                numeros = sc.nextFloat();

                soma += numeros;
            }

            media = (soma / 3);

            System.out.printf("O valor médio dos 3 números é %.2f", media);


            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("O valor informado não é um número. Informe corretamente!");
        }

    }
}
