package ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Funcionario> funcionarios = new ArrayList<>();

       funcionarios.add(new Gerente("Alice", 8000));
       funcionarios.add(new Vendedor("Bob", 3000, 50000));
       funcionarios.add(new Vendedor("Carol", 3500, 70000));
       funcionarios.add(new Gerente("David", 10000));

       for (Funcionario f : funcionarios) {
          System.out.println(f.getNome() + " - Bônus: " + f.calcularBonus());
        }
    }  
}
