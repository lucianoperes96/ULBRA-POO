public abstract class T01_Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método abstrato que será implementado nas subclasses
    public abstract String informacoesVeiculo();
}
