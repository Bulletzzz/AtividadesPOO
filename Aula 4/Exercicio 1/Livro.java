public class Livro{
    private String titulo;
    private String autor;
    private int ano;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
        else {
            System.out.println("Este ano é inválido");
        }
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Pequeno Príncipe");
        livro.setAutor("Antoine de Saint-Exupéry");
        livro.setAno(1943);

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de publicação: " + livro.getAno());
        }
}
