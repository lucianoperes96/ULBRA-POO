import java.util.Scanner;

public class T07_GeradorTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = sc.nextInt();

        // Laço para gerar a tabuada de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}