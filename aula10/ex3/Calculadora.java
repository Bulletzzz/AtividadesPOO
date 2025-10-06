package aula10.ex3;

public class Calculadora {
    public static int dividir(int a, int b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
