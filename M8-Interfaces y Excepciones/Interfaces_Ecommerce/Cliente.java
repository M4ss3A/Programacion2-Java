package tp8.interfaces;

public class Cliente implements Notificable{
    
    private final String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificarCamboDeEstado(String nuevoEstado) {
        System.out.println(nombre + " tu pedido cambio de estado a " + nuevoEstado);
    }
}