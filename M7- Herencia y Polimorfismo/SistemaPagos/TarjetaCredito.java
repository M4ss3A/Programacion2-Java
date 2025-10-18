package tp7.ejercicio5;


public class TarjetaCredito implements Pagable {
    @Override
    public void pagar() {
        System.out.println("Pago Tarjeta de credito");
    }
}
