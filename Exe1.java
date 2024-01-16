import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        if(altura >= 1.80){
            System.out.println("Você é alto(a)!");
        }else{
            System.out.println("Você não é tão alto(a)");
        }

        sc.close();
    }
}
