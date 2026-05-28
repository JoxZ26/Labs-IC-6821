public class EstadoEnviado implements EstadoPedido {

    @Override
    public void agregarProducto(Pedido pedido, String producto) {
        System.out.println("No se pueden agregar productos. El pedido ya fue enviado.");
    }

    @Override
    public void cancelarPedido(Pedido pedido) {
        System.out.println("No se puede cancelar. El pedido ya fue enviado.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("El pedido ya fue enviado.");
    }
}
