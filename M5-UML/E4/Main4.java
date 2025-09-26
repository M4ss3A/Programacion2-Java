
package tp5.ejercicio4;


public class Main4 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ayelen Masseroni", "11111111");
        Banco banco = new Banco("BBVA", "27-1111111-7");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-1234-4321-1432", "1/26", banco);
        cliente.setTarjeta(tarjeta);
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());
    }      
}
