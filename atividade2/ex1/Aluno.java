package atividade2.ex1;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;

    public Aluno (String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return nome + " (" + matricula + ") - " + curso;
    }
}
