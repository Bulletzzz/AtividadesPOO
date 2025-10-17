public class VerificadorStatusRefatorado {
    public String verificarStatusPedido(StatusPedido status) {
        if (status == StatusPedido.NOVO) {
            return "Pedido novo.";
        }
        if (status == StatusPedido.PROCESSANDO) {
            return "Pedido em processamento.";
        }
        if (status == StatusPedido.ENVIADO) {
            return "Pedido enviado.";
        }
        return "Pedido entregue.";
    }
}