class Cliente {
    String nome;

    Cliente(String nome) {
        this.nome = nome;
    }

    void exibirNome() {
        System.out.println("Cliente: " + nome);
    }
}

class Prato {
    String nome;
    float preco;

    Prato(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void exibirPrato() {
        System.out.printf("Prato: %s - R$ %.2f\n", nome, preco);
    }
}

class Pedido {
    Cliente cliente;
    Prato[] pratos = new Prato[10];
    int quantidadePratos = 0;

    Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    void adicionarPrato(Prato prato) {
        if (quantidadePratos < pratos.length) {
            pratos[quantidadePratos] = prato;
            quantidadePratos++;
        } else {
            System.out.println("Limite máximo de pratos atingido no pedido.");
        }
    }

    void exibirPedido() {
        cliente.exibirNome();
        System.out.println("Itens do pedido:");
        float total = 0;
        for (int i = 0; i < quantidadePratos; i++) {
            pratos[i].exibirPrato();
            total += pratos[i].preco;
        }
        System.out.printf("Total: R$ %.2f\n", total);
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucas");
        Prato prato1 = new Prato("Pizza", 30.00f);
        Prato prato2 = new Prato("Refrigerante", 7.50f);

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);

        pedido.exibirPedido();
    }
}

