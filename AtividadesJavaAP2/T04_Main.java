public class T04_Main {
    public static void main(String[] args) {
        T02_Carro carro = new T02_Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.setAno(2020);
        carro.numeroPortas = 4;

        T03_Moto moto = new T03_Moto();
        moto.marca = "Honda";
        moto.modelo = "CB 500F";
        moto.setAno(2022);
        moto.setCilindrada(500);

        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}