package ex3;

public class Recibo implements Imprimivel {
    private double valor;

    public Recibo(double valor) {
        this.valor = valor;
    }

    @Override
    public void imprimir() {
        System.out.println("Recibo - Valor: R$ " + valor);
    }
}
