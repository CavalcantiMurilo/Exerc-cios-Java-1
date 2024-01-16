import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase;

        char[] arrayDeChar;
        int tamanho, j = 0;

        System.out.println("Digite uma String: ");
        frase = sc.nextLine();

        tamanho = frase.length();
        char[] novoArray = new char[tamanho];
        arrayDeChar = frase.toCharArray();
        
        for(int i = tamanho - 1; i >=0; i-- ){

            novoArray[j] = arrayDeChar[i];

            j++;

        }

        for(int k = 0; k < tamanho; k++){
            System.out.print(novoArray[k]);
        }

        sc.close();

    }
}
