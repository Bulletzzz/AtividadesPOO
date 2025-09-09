package ex3;

public class Main {
    public static void main(String[] args) {
        Imprimivel rel = new Relatorio("Vendas do mês de setembro");
        Imprimivel rec = new Recibo(250.75);

        rel.imprimir();
        rec.imprimir();
    }
}

