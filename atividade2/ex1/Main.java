package atividade2.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Johann", 507, "Eng Software"));
        alunos.add(new Aluno("Eduardo", 901, "Eng Software"));
        alunos.add(new Aluno("Orc", 110, "Eng Civil"));

        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

}
