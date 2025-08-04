class Livro {
    String titulo;
    String autor;
    int isbn;

    public Livro (String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public void exibirDados() {
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nISBN: " +isbn);
    }

     public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 123456);
        livro.exibirDados();
    }
}

