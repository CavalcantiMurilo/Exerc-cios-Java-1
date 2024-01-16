import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        double numero1, numero2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero1 = sc.nextDouble();
        System.out.println("Digite mais um número: ");
        numero2 = sc.nextDouble();

        System.out.println("A soma desses números é: " + String.format("%.2f",(numero1 + numero2)));


        sc.close();

    }
}
