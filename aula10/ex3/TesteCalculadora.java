package aula10.ex3;

public class TesteCalculadora {
    public static void main(String[] args) {
        try {
            int resultado = Calculadora.dividir(10, 0); // divisão por zero
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
