public class Curso {
    String nome;
    String codigo;
    int cargaHoraria;

    public Curso(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirDados() {
        System.out.println("Curso: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
    }

    public static void main(String[] args) {
        Curso curso = new Curso("Programação Java", "JAVA101", 60);
        curso.exibirDados();
    }
}