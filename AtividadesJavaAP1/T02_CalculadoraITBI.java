import javax.swing.JOptionPane;

public class T02_CalculadoraITBI {
    public static void main(String[] args) {
        // Entrada de dados via JOptionPane
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de transação do imóvel:"));
        double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal do imóvel:"));
        double percentualImposto = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do ITBI (%):"));

        // Determina o maior valor entre transação e venal
        double baseCalculo = Math.max(valorTransacao, valorVenal);

        // Cálculo do imposto
        double valorITBI = baseCalculo * (percentualImposto / 100);

        JOptionPane.showMessageDialog(null, "Base de cálculo: R$ " + baseCalculo +
                "\nValor do ITBI: R$ " + valorITBI);
    }
}
