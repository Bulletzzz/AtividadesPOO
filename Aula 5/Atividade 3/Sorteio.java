import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Diana");
        nomes.add("Eduardo");

        Random random = new Random();

        int indiceSorteado = random.nextInt(nomes.size());
        String nomeSorteado = nomes.get(indiceSorteado);
        System.out.println("Nome sorteado: " + nomeSorteado);
    }
}
