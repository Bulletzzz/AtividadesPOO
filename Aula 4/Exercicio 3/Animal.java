public class Animal {
    private String nome;
    private String especie;

    public Animal (String nome, String especie) {
        if (!nome.isEmpty()) {
        this.nome = nome;}
        else {
            this.nome = "Animal não cadastrado";
        }
        this.especie = especie;
    }

    public String consultaAnimal () {
        return "Nome: " + nome + "\nEspecie: " + especie;
    }

    public void mudaNome (String nomenovo) {
        if (nomenovo != null && !nomenovo.trim().isEmpty()) {
            this.nome = nomenovo;
        } else {
            System.out.println("Nome inválido. O nome não foi alterado.");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("", "Gato");
        System.out.println(animal.consultaAnimal());

        animal.mudaNome("Gilberto");
        System.out.println(animal.consultaAnimal());

        animal.mudaNome("");  
    }
}   
