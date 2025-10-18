package tp8.interfaces;

public class PagoTarjetaCredito implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("El monto total es: " + monto);
        System.out.println("El pago fue realizado");
    }
}
