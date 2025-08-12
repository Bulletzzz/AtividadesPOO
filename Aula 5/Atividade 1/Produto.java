public class Produto {
    private String nome;
    private double preco;

    public Produto() {
        this.nome = "Mouse Logitech";
        this.preco = 250.50;
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        if (preco < 0) {
            this.preco = 0.0;
            System.out.println("Preço inválido!");
        } else {
            this.preco = preco;
        }
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto(); 
        Produto produto2 = new Produto("Teclado Redragon", -156); 
    }
}
