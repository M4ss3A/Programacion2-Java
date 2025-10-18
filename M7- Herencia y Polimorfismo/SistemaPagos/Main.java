package tp7.ejercicio5;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) { 
        ArrayList<Pagable> formasDePago = new ArrayList<>();

        formasDePago.add(new TarjetaCredito());
        formasDePago.add(new Transferencia());
        formasDePago.add(new Efectivo());

        for (Pagable p : formasDePago) {
            procesarPago(p);
        }
    }
    public static void procesarPago(Pagable medio) {
        medio.pagar();
    }     
}
