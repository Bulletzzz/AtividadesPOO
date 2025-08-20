package atividade2.ex4;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Caneta", 10, 2.5);
        pedido.adicionarItem("Caderno", 5, 15.0);
        pedido.adicionarItem("Borracha", 2, 3.0);

        pedido.removerItem("Caderno");

        System.out.println("Valor total: " + pedido.valorTotal());
    }
}
