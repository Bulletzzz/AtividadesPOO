import java.util.ArrayList;

public class Exercicio1 {

    abstract static class Forma {
        public abstract double area();
    }

    static class Retangulo extends Forma {
        private double largura, altura;

        public Retangulo(double largura, double altura) {
            this.largura = largura;
            this.altura = altura;
        }

        @Override
        public double area() {
            return largura * altura;
        }
    }

    static class Circulo extends Forma {
        private double raio;

        public Circulo(double raio) {
            this.raio = raio;
        }

        @Override
        public double area() {
            return Math.PI * raio * raio;
        }
    }

    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Retangulo(4, 5));
        formas.add(new Circulo(3));
        formas.add(new Retangulo(2, 6));

        double soma = 0;
        for (Forma f : formas) {
            soma += f.area();
        }

        System.out.println("Soma das áreas: " + soma);
    }
}
