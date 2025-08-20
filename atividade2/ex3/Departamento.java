package atividade2.ex3;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento (String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
