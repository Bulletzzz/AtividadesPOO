package aula06;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}

class Gerente extends Funcionario {
    String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalário: R$ " + salario + "\nSetor: " + setor;
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Robert", 22000.10, "Frigorífico");
        System.out.println(gerente);
    }
}
