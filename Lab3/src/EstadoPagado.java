public class EstadoPagado implements EstadoPedido {

    @Override
    public void agregarProducto(Pedido pedido, String producto) {
        System.out.println("No se pueden agregar productos. El pedido ya fue pagado.");
    }

    @Override
    public void cancelarPedido(Pedido pedido) {
        System.out.println("Pedido cancelado y reembolso realizado.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Pedido despachado.");
        pedido.setEstado(new EstadoEnviado());
    }
}