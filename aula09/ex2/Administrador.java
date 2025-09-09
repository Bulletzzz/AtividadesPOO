package ex2;

public class Administrador implements Autenticavel {
    private String senha;

    public Administrador(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
