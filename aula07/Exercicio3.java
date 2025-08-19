import java.util.ArrayList;

public class Exercicio3 {

    static class Produto {
        String nome;
        double preco;
        int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        @Override
        public String toString() {
            return "Produto: " + nome + " (" + quantidade + ") - " + preco;
        }
    }

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 20.0, 2));
        produtos.add(new Produto("Feijão", 10.0, 3));
        produtos.add(new Produto("Macarrão", 5.5, 5));

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
