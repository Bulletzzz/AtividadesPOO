public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1);
        System.out.println("Status inicial: " + pedido.getStatus());

        VerificadorStatus verificador = new VerificadorStatus();
        System.out.println("Verificador original: " + verificador.verificarStatusPedido(pedido.getStatus()));

        pedido.atualizarStatus(StatusPedido.ENVIADO);
        System.out.println("Status atualizado: " + pedido.getStatus());

        VerificadorStatusRefatorado verificadorRefatorado = new VerificadorStatusRefatorado();
        System.out.println("Verificador refatorado: " + verificadorRefatorado.verificarStatusPedido(pedido.getStatus())); 
    }
}