public class EstadoEntregado implements EstadoPedido {

    @Override
    public void agregarProducto(Pedido pedido, String producto) {
        System.out.println("No se pueden agregar productos. Pedido entregado.");
    }

    @Override
    public void cancelarPedido(Pedido pedido) {
        System.out.println("No se puede cancelar. Pedido entregado.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Pedido ya entregado.");
    }
}