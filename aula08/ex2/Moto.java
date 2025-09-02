package ex2;

class Moto extends Veiculo {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }
}
