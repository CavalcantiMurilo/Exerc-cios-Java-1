import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite algo: ");
        String palavras = sc.nextLine();

        System.out.println("O tamanho da String é: " + palavras.length());
        sc.close();

    }
}
