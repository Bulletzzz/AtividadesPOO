package atividade2.ex3;

public class Main {
    public static void main(String[] args) {
        Departamento ti = new Departamento("TI");
        Departamento rh = new Departamento("RH");

        Funcionario func1 = new Funcionario("Leo", 5000, ti);
        Funcionario func2 = new Funcionario("Isabela", 4500, rh);
        Funcionario func3 = new Funcionario("Gabriel", 5500, ti);

        ti.adicionarFuncionario(func1);
        ti.adicionarFuncionario(func3);
        rh.adicionarFuncionario(func2);

        System.out.println("Funcionarios do TI:");
        ti.listarFuncionarios();

        System.out.println("Funcionarios do RH:");
        rh.listarFuncionarios();
    }
}
