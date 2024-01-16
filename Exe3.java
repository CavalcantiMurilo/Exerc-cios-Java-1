import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0 ;
        char letra = 0;

        char[] vogais = {'A', 'B', 'C', 'D', 'E', 'a', 'b', 'c', 'd', 'e'};

        System.out.println("Digite o seu nome: ");
        String palavra = sc.nextLine();

        for(int i = 0; i < vogais.length; i++) {

            if (palavra.charAt(0) == vogais[i]) {
                soma++;
                letra = vogais[i];
            }

        }

        if (soma == 1){
            System.out.println("A primeira letra do seu nome é uma vogal e ela é: " + letra);
        } else {
            System.out.println("A primeira letra do seu nome não é uma vogal");
    }

    }
}
