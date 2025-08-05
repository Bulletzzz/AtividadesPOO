public class Aluno {
    private String nome;
    private double nota;

    public Aluno (String nome) {
        this.nome = nome;
        this.nota = 0.0;
    }

    public void adicionarNota(double valorn) {
        if (valorn > 0 && (valorn + this.nota) < 10 ) {
            this.nota += valorn;
            System.out.println("Nota adicionada com sucesso!");
        }
        else {
            System.err.println("Erro: Valor menor do que zero ou maior do que 10.");
        }
    }

    public void retirarNota(double valorn) {
        if (valorn > 0 && this.nota >= valorn ) {
            this.nota -= valorn;
            System.out.println("Nota retirada com sucesso!");
        }
        else {
            System.err.println("Erro: Valor invalido ou nota insuficiente.");
        }
    }

    public double getNota () {
        return nota;
    }

    public String getNome () {
        return nome;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno ("João");

        aluno.adicionarNota(4.5);  
        aluno.adicionarNota(6);    

        aluno.retirarNota(2);      
        aluno.retirarNota(5);      

        aluno.adicionarNota(-1);   

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Nota final: " + aluno.getNota());

    }
}