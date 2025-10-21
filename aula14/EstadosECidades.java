import java.util.*;

public class EstadosECidades {

    // (a) Adicionar cidade a um estado
    public static void adicionarCidade(Map<String, List<String>> mapa, String estado, String cidade) {
        mapa.putIfAbsent(estado, new ArrayList<>());
        mapa.get(estado).add(cidade);
    }

    // (b) Retornar lista de cidades de um estado
    public static List<String> cidadesDoEstado(Map<String, List<String>> mapa, String estado) {
        return mapa.getOrDefault(estado, Collections.emptyList());
    }

    // (c) Imprimir todas as cidades de cada estado
    public static void imprimirMapa(Map<String, List<String>> mapa) {
        for (String estado : mapa.keySet()) {
            System.out.println("Estado: " + estado);
            for (String cidade : mapa.get(estado)) {
                System.out.println("  - " + cidade);
            }
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Map<String, List<String>> mapa = new HashMap<>();

        adicionarCidade(mapa, "SP", "São Paulo");
        adicionarCidade(mapa, "SP", "Campinas");
        adicionarCidade(mapa, "RJ", "Rio de Janeiro");
        adicionarCidade(mapa, "RJ", "Niterói");
        adicionarCidade(mapa, "PR", "Curitiba");
        adicionarCidade(mapa, "PR", "Londrina");

        System.out.println("Cidades do estado SP:");
        System.out.println(cidadesDoEstado(mapa, "SP"));
        System.out.println();

        System.out.println("Todas as cidades:");
        imprimirMapa(mapa);
    }
}
