
package tp7.ejercicio6;


public class Main6 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ayelen Masseroni", "1111111111111");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("13/10/2026", "20:00", mesa);
        reserva.setCliente(cliente);
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Mesa: " + reserva.getMesa().getNumero());
    }   
}
