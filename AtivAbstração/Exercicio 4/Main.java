class Funcionario {
    String nome;
    Departamento departamento;

    Funcionario(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    void exibirFuncionario() {
        System.out.println("Funcionário: " + nome + " - Departamento: " + departamento.nome);
    }
}

class Departamento {
    String nome;
    Funcionario[] funcionarios = new Funcionario[10]; 
    int quantidadeFuncionarios = 0;

    Departamento(String nome) {
        this.nome = nome;
    }

    void adicionarFuncionario(Funcionario f) {
        if (quantidadeFuncionarios < funcionarios.length) {
            funcionarios[quantidadeFuncionarios] = f;
            quantidadeFuncionarios++;
        } else {
            System.out.println("Limite de funcionários atingido.");
        }
    }

    void exibirDepartamento() {
        System.out.println("Departamento: " + nome);
        System.out.println("Funcionários:");
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("- " + funcionarios[i].nome);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Departamento depto = new Departamento("Recursos Humanos");

        Funcionario f1 = new Funcionario("Alice", depto);
        Funcionario f2 = new Funcionario("Bruno", depto);
        Funcionario f3 = new Funcionario("Carla", depto);

        depto.adicionarFuncionario(f1);
        depto.adicionarFuncionario(f2);
        depto.adicionarFuncionario(f3);

        depto.exibirDepartamento();
    }
}
