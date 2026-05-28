

public interface EstadoPedido {
    void agregarProducto(Pedido pedido, String producto);
    void cancelarPedido(Pedido pedido);
    void despachar(Pedido pedido);
}