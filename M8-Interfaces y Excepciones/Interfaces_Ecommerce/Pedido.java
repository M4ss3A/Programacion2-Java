package tp8.interfaces;
import java.util.ArrayList;

public class Pedido implements Pagable {
    // Atributos
    ArrayList<Producto> productos; // Lista de productos del pedido
    private String estado;        // Cliente asociado al pedido
    private Cliente cliente;     // Estado actual del pedido
    
    // Constructor - Inicio de array
    public Pedido(String estado, Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = estado;
    }
    //Agregar producto al array
    public void agregarProducto(Producto producto) {
        if (producto != null) { //Si es nulo no se agrega
            productos.add(producto);
        }
    }
    // Sobreescribe el metodo total del pedido
     @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
    //Notifica el estado del pedido
   public void notificarEstado(String nuevoestado) {
        this.estado = nuevoestado;
        cliente.notificarCamboDeEstado(nuevoestado);
    } 
}