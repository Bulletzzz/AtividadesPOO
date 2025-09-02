package ex2;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla");
        Veiculo moto = new Moto("Honda", "CB500");

        carro.exibirDados();
        carro.acelerar();

        moto.exibirDados();
        moto.acelerar();
    }
}
