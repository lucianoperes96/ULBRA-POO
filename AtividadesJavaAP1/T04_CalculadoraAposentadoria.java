import java.util.Scanner;

public class T04_CalculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Informe seu sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        System.out.print("Informe seus anos de contribuição: ");
        int contribuicao = sc.nextInt();

        boolean podeAposentar = false;
        int faltaIdade = 0;
        int faltaContribuicao = 0;

        // Regras básicas (exemplo simplificado)
        if (sexo == 'M') {
            if (idade >= 65 || contribuicao >= 35) {
                podeAposentar = true;
            } else {
                faltaIdade = Math.max(0, 65 - idade);
                faltaContribuicao = Math.max(0, 35 - contribuicao);
            }
        } else if (sexo == 'F') {
            if (idade >= 62 || contribuicao >= 30) {
                podeAposentar = true;
            } else {
                faltaIdade = Math.max(0, 62 - idade);
                faltaContribuicao = Math.max(0, 30 - contribuicao);
            }
        }

        if (podeAposentar) {
            System.out.println("Você já pode se aposentar!");
        } else {
            System.out.println("Ainda não pode se aposentar.");
            System.out.println("Faltam " + faltaIdade + " anos de idade ou " + faltaContribuicao + " anos de contribuição.");
        }

        sc.close();
    }
}