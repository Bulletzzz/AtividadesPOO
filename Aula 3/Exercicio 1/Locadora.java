public class Locadora {

    static class Filme {
        private String titulo;
        private String genero;

        public Filme(String titulo, String genero) {
            this.titulo = titulo;
            this.genero = genero;
        }

        public void exibirInfo() {
            System.out.println("Filme: " + titulo + " | Gênero: " + genero);
        }
    }


    static class Cliente {
        private String nome;
        private String cpf;

        public Cliente(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        public void exibirInfo() {
            System.out.println("Cliente: " + nome + " | CPF: " + cpf);
        }
    }


    static class Locacao {
        private Cliente cliente;
        private Filme filme;

        public Locacao(Cliente cliente, Filme filme) {
            this.cliente = cliente;
            this.filme = filme;
        }

        public void realizarLocacao() {
            System.out.println("Locação realizada com sucesso!");
            cliente.exibirInfo();
            filme.exibirInfo();
        }
    }


    public static void main(String[] args) {
        Cliente cliente = new Cliente("João da Silva", "123.456.789-00");
        Filme filme = new Filme("O Poderoso Chefão", "Drama");
        Locacao locacao = new Locacao(cliente, filme);

        locacao.realizarLocacao();
    }
}
