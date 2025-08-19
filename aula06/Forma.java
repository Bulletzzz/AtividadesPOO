package aula06;

public class Forma {
    String cor;
    boolean preenchida;

    public Forma (String cor, boolean preenchida) {
        this.cor = cor;
        this.preenchida = preenchida;
    }

    static class Retangulo extends Forma {
        private double altura;
        private double largura;
    
        public Retangulo (String cor, boolean preenchida, double largura, double altura){
            super(cor, preenchida);
            this.largura = largura;
            this.altura = altura;
        }
    
        public double calcularArea() {
            return largura * altura;
        }
    
    }
    
    static class Circulo extends Forma {
        private double raio;

        public Circulo (String cor, boolean preenchida, double raio) {
            super (cor, preenchida);
            this.raio =  raio;
        }

        public double calcularArea () {
            return Math.PI * raio * raio;
        }
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo("verde", false, 12.0, 14.0);
        Circulo circulo = new Circulo("roxo", true, 4.0);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}
