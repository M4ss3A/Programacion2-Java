
package tp5.ejercicio5;


public class Main5 {
    public static void main(String[] args) {
       Propietario propietario = new Propietario("Ayelen Masseroni", "123451561");
       Computadora pc = new Computadora("HP", "af258", "bbf 123", "E108");
       propietario.setComputadora(pc);

       System.out.println("Propietario: " + pc.getPropietario().getNombre());
       System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo());
    }    
}
