package aula10.ex1;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        try {
            System.out.println("Valor: " + numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora do limite do array.");
        }
    }
}
