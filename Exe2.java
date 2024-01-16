import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resposta;
        System.out.println("Você tem carteira de motorista? S/N");
        resposta = sc.nextLine().charAt(0);

        if (resposta == 'S'){
            System.out.println("Você pode dirigir!");
        }else if(resposta =='N'){
            System.out.println("Você não pode dirigir!");
        }else{
            System.out.println("Resposta inválida");
        }

        sc.close();
    }
}
