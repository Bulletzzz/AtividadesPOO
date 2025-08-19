public class Exercicio2 {

    static class Veiculo {
        public void mover() {
            System.out.println("O veículo está se movendo");
        }
    }

    static class Carro extends Veiculo {
        @Override
        public void mover() {
            System.out.println("O carro está dirigindo");
        }
    }

    static class Bicicleta extends Veiculo {
        @Override
        public void mover() {
            System.out.println("A bicicleta está pedalando");
        }
    }

    public static void testarMovimento(Veiculo v) {
        v.mover();
    }

    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bike = new Bicicleta();

        testarMovimento(carro);
        testarMovimento(bike);
    }
}
