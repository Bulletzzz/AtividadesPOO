class Quarto {
    int numero;
    String tipo;
    String status;

    Quarto(int numero, String tipo, String status) {
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
    }

    void exibirQuarto() {
        System.out.println("Quarto número: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
    }
}

class Hospede {
    String nome;
    String documento;

    Hospede(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    void exibirHospede() {
        System.out.println("Hóspede: " + nome);
        System.out.println("Documento: " + documento);
    }
}

class Reserva {
    Quarto quarto;
    Hospede hospede;
    String dataEntrada;
    String dataSaida;

    Reserva(Quarto quarto, Hospede hospede, String dataEntrada, String dataSaida) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    void exibirReserva() {
        System.out.println("Reserva:");
        quarto.exibirQuarto();
        hospede.exibirHospede();
        System.out.println("Data de entrada: " + dataEntrada);
        System.out.println("Data de saída: " + dataSaida);
    }
}

public class Main {
    public static void main(String[] args) {
        Quarto q = new Quarto(101, "Suíte", "Disponível");
        Hospede h = new Hospede("Carlos Silva", "123456789");
        Reserva r = new Reserva(q, h, "2025-08-10", "2025-08-15");

        r.exibirReserva();
    }
}
