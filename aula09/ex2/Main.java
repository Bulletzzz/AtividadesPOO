package ex2;

public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario("1234");
        Administrador admin = new Administrador("admin");

        System.out.println("Usuário autenticado? " + user.autenticar("1234"));
        System.out.println("Administrador autenticado? " + admin.autenticar("senhaErrada"));
    }
}

