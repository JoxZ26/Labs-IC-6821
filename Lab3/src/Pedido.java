import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private EstadoPedido estado;
    private List<String> productos;

    public Pedido() {
        estado = new EstadoCarrito();
        productos = new ArrayList<>();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void agregarProducto(String producto) {
        estado.agregarProducto(this, producto);
    }

    public void cancelarPedido() {
        estado.cancelarPedido(this);
    }

    public void despachar() {
        estado.despachar(this);
    }

    public List<String> getProductos() {
        return productos;
    }

    public void pagarPedido() {
        System.out.println("Pedido pagado.");
        setEstado(new EstadoPagado());
    }
}