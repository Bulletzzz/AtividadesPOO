package aula10.ex2;

public class CadastroUsuario {
    public static void main(String[] args) {
        try {
            Usuario usuario = new Usuario("João", 16);
            usuario.exibir();
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }
}
