public class EstadoCarrito implements EstadoPedido {

    @Override
    public void agregarProducto(Pedido pedido, String producto) {
        pedido.getProductos().add(producto);
        System.out.println("Producto agregado: " + producto);
    }

    @Override
    public void cancelarPedido(Pedido pedido) {
        System.out.println("Pedido cancelado desde carrito.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("No se puede despachar. El pedido no ha sido pagado.");
    }
}