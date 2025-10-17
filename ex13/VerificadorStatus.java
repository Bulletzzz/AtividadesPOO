public class VerificadorStatus {
    public String verificarStatusPedido(StatusPedido status) {
        if (status == StatusPedido.NOVO) {
            return "Pedido novo.";
        } else {
            if (status == StatusPedido.PROCESSANDO) {
                return "Pedido em processamento.";
            } else {
                if (status == StatusPedido.ENVIADO) {
                    return "Pedido enviado.";
                } else {
                    return "Pedido entregue.";
                }
            }
        }
    }
}