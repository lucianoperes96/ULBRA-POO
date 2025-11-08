import javax.swing.JOptionPane;

public class T03_SistemaAvaliacao {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova:"));
        double trabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho:"));

        // Cálculo da média
        double media = (nota1 + nota2 + trabalho) / 3;

        String resultado = (media >= 6) ? "Aprovado" : "Reprovado";

        JOptionPane.showMessageDialog(null, "Média: " + String.format("%.2f", media) + "\nSituação: " + resultado);
    }
}