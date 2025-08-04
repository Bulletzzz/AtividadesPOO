public class Animal {
    String nome;
    String especie;
    int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public void fazerBarulho() {
        System.out.println(nome + " faz barulho!");
    }

    public static void main(String[] args) {
        Animal cachorro = new Animal("Rex", "Cachorro", 5);
        Animal gato = new Animal("Mimi", "Gato", 3);

        cachorro.fazerBarulho();  
        gato.fazerBarulho();     
    }
}
