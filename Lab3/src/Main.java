public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        System.out.println("=================================");
        System.out.println("   SISTEMA DE PEDIDOS E-COMMERCE");
        System.out.println("=================================");

        System.out.println("\n[1] PEDIDO EN ESTADO: CARRITO");

        pedido.agregarProducto("Laptop");
        pedido.agregarProducto("Mouse");
        pedido.agregarProducto("Teclado");

        System.out.println("\nProductos actuales:");
        System.out.println(pedido.getProductos());

        System.out.println("\nIntentando despachar sin pagar...");
        pedido.despachar();

        System.out.println("\n=================================");
        System.out.println("       PROCESANDO PAGO");
        System.out.println("=================================");

        pedido.pagarPedido();

        System.out.println("\n[2] PEDIDO EN ESTADO: PAGADO");

        System.out.println("\nIntentando agregar otro producto...");
        pedido.agregarProducto("Monitor");

        System.out.println("\nIntentando despachar pedido...");
        pedido.despachar();

        System.out.println("\n=================================");
        System.out.println("       PEDIDO ENVIADO");
        System.out.println("=================================");

        System.out.println("\n[3] PEDIDO EN ESTADO: ENVIADO");

        System.out.println("\nIntentando cancelar pedido...");
        pedido.cancelarPedido();

        System.out.println("\nIntentando agregar producto...");
        pedido.agregarProducto("Audífonos");

        System.out.println("\nIntentando despachar nuevamente...");
        pedido.despachar();

        System.out.println("\n=================================");
        System.out.println("       RESUMEN FINAL");
        System.out.println("=================================");

        System.out.println("Productos del pedido:");
        System.out.println(pedido.getProductos());

        System.out.println("\nFin de la simulación.");
    }
}