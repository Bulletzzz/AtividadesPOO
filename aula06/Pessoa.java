package aula06;

public class Pessoa{
    String nome;

    public Pessoa (String nome) {
        this.nome = nome;
    }

    static class Aluno extends Pessoa {
        int matricula;

        public Aluno (String nome, int matricula) {
            super(nome);
            this.matricula = matricula;
        }

        public void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Matricula: " + matricula);
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Cleber", 12345);

        aluno.exibirDados();
    }
}