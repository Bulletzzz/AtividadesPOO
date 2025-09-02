package ex3;

class Vendedor extends Funcionario {
    private double vendasMensais;

    public Vendedor(String nome, double salario, double vendasMensais) {
        super(nome, salario);
        this.vendasMensais = vendasMensais;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05 + vendasMensais * 0.02;
    }
}
