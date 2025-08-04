

public class Aluno {
    String nome;
    int matricula;
    float notas[] = new float[10];
    int nnotas = 0;

    public void addnota(float nota) {
        if (nnotas < notas.length) {
            notas[nnotas] = nota;
            nnotas++;
        } else {
            System.out.println("O limite máximo de notas já foi atingido");
        }
    }

    public float calculoMedia() {
        if (nnotas == 0) {
            return 0;
        }

        float soma = 0;
        for (int i = 0; i < nnotas; i++) {
            soma += notas[i];
        }

        return soma / nnotas;
    }

    public void exibirBoletim() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Notas:");
        for (int i = 0; i < nnotas; i++) {
            System.out.println("- " + notas[i]);
        }
        System.out.printf("Média: %.2f\n", calculoMedia());
    }


    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Ana Clara";
        aluno.matricula = 20251234;

        aluno.addnota(8.5f);
        aluno.addnota(7.0f);
        aluno.addnota(9.5f);

        aluno.exibirBoletim();
    }
}

