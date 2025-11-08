import java.util.Scanner;

public class T05_CircuitoResistencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] resistencias = new double[4];
        double soma = 0;

        // Entrada de 4 resistências
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor da resistência " + (i + 1) + ": ");
            resistencias[i] = sc.nextDouble();
            soma += resistencias[i];
        }

        // Calcula maior e menor resistência
        double maior = resistencias[0];
        double menor = resistencias[0];
        for (double r : resistencias) {
            if (r > maior) maior = r;
            if (r < menor) menor = r;
        }

        System.out.println("Resistência equivalente (série): " + soma + " ohms");
        System.out.println("Maior resistência: " + maior + " ohms");
        System.out.println("Menor resistência: " + menor + " ohms");

        sc.close();
    }
}