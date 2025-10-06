package aula10.ex2;

public class Usuario {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("Usuário deve ter pelo menos 18 anos.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public void exibir() {
        System.out.println("Usuário: " + nome + ", Idade: " + idade);
    }
}
