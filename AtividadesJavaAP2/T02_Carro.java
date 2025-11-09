public class T02_Carro extends T01_Veiculo {
    public int numeroPortas;

    @Override
    public String informacoesVeiculo() {
        return "Carro - Marca: " + marca + ", Modelo: " + modelo +
                ", Ano: " + getAno() + ", Número de Portas: " + numeroPortas;
    }
}