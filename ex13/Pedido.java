public class Pedido {
    private int id;
    private StatusPedido status;

    public Pedido(int id) {
        this.id = id;
        this.status = StatusPedido.NOVO; 
    }

    public void atualizarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }

    public StatusPedido getStatus() {
        return status;
    }
}