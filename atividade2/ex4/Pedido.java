package atividade2.ex4;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> pedidos;

    public Pedido() {
        pedidos = new ArrayList<>();
    }

    public void adicionarItem(String produto, int quantidade, double precoUnitario) {
        pedidos.add(new ItemPedido(produto, quantidade, precoUnitario));
    }

    public void removerItem(String produto) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getProduto().equals(produto)) {
                pedidos.remove(i);
                break;
            }
        }
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : pedidos) {
            total += item.getQuantidade() * item.getPrecoUnitario();
        }
        return total;
    }

    private class ItemPedido {
        private String produto;
        private int quantidade;
        private double precoUnitario;

        public ItemPedido(String produto, int quantidade, double precoUnitario) {
            this.produto = produto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public String getProduto() {
            return produto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double getPrecoUnitario() {
            return precoUnitario;
        }

        @Override
        public String toString() {
            return produto + " - " + quantidade + " x " + precoUnitario;
        }
    }
}
