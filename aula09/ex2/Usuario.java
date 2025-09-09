package ex2;

public class Usuario implements Autenticavel {
    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
