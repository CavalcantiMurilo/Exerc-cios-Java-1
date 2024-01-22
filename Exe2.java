import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.println("Você tem carteira de motorista? S/N");
        resposta = sc.nextLine();

        resposta = resposta.trim();

        if (resposta.equals("S") || resposta.equals("s")){
            System.out.println("Você pode dirigir!");
        }else if(resposta.equals("N") || resposta.equals("n")){
            System.out.println("Você não pode dirigir!");
        }else{
            System.out.println("Resposta inválida! Digite 'S/s' ou 'N/n'");
        }

        sc.close();
    }
}
