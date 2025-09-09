package ex1;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica c = new Circulo(5);
        FormaGeometrica r = new Retangulo(4, 6);

        System.out.println("Área do círculo: " + c.calcularArea());
        System.out.println("Área do retângulo: " + r.calcularArea());
    }
}
