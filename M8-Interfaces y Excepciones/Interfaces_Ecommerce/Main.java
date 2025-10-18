package tp8.interfaces;

public class Main {
  
    public static void main(String[] args) {
        // Creacion de clientes
        Cliente c1 = new Cliente("Cliente 1");
        Cliente c2 = new Cliente("Cliente 2");
        
        // Creacion de  pedido por cliente
        Pedido pedido = new Pedido("Pendiente", c1);
        Pedido pedido2 = new Pedido("Pendiente", c2);
       
        // Crea productos
        Producto p1 = new Producto("Computadora", 930000);
        Producto p2 = new Producto("Iphone 17", 1300000);
        Producto p3 = new Producto("Tv Smart", 950000);
        
        // Agrega producto al pedido del cliente 1
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p3);
        
        // Notifica el estado del pedido del cliente 1
        pedido.notificarEstado("EN PROCESO");
        
        // Calcula el total del pedido del cliente 1
        double total = pedido.calcularTotal();
        
        // Crea pago con pay pal
        PagoPayPal pago = new PagoPayPal();
        
        // Procesa el pago 
        pago.procesarPago(total);
        
        // Notifica el estado del pedido pagado
        pedido.notificarEstado("PAGADO");
       
        // Agrega producto al pedido del cliente 2
        pedido2.agregarProducto(p2);
        
        // Notifica su estado
        pedido2.notificarEstado("EN PROCESO");
        
        // Calcula el total del pedido del cliente 2
        double total2 = pedido2.calcularTotal();
        
        // Crea pago con tarjeta
        PagoTarjetaCredito pago2 = new PagoTarjetaCredito();
        
        // Procesa el pago 
        pago2.procesarPago(total2);
        
        // Notifica al cliente 2 su estado de pedido pagado
        pedido2.notificarEstado("PAGADO");    
    }
}
