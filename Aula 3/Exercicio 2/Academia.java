public class Academia {

    static class Aluno {
        private String nome;
        private int idade;

        public Aluno(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public void exibirInfo() {
            System.out.println("Aluno: " + nome + " | Idade: " + idade);
        }
    }

    static class Treinador {
        private String nome;
        private String especialidade;

        public Treinador(String nome, String especialidade) {
            this.nome = nome;
            this.especialidade = especialidade;
        }

        public void apresentar() {
            System.out.println("Treinador: " + nome + " | Especialidade: " + especialidade);
        }
    }

    static class Treino {
        private String tipo;
        private int duracaoMinutos;

        public Treino(String tipo, int duracaoMinutos) {
            this.tipo = tipo;
            this.duracaoMinutos = duracaoMinutos;
        }

        public void mostrarTreino() {
            System.out.println("Treino: " + tipo + " | Duração: " + duracaoMinutos + " minutos");
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas", 22);
        Treinador treinador = new Treinador("Carlos", "Musculação");
        Treino treino = new Treino("Hipertrofia", 60);

        aluno.exibirInfo();
        treinador.apresentar();
        treino.mostrarTreino();
    }
}
