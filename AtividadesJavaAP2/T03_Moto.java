public class T03_Moto extends T01_Veiculo {
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String informacoesVeiculo() {
        return "Moto - Marca: " + marca + ", Modelo: " + modelo +
                ", Ano: " + getAno() + ", Cilindrada: " + cilindrada + "cc";
    }
}