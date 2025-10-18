package tp8.interfaces;

public class PagoPayPal implements PagoConDescuento {
    
      @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * 0.20);
    }

    @Override
    public void procesarPago(double monto) {
        double total = aplicarDescuento(monto);
        System.out.println("El total con descuento es: " + total);
        System.out.println("El pago fue realizado.");
    }
}
