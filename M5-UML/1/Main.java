
package tp5.ejercicio1;


public class Main {

  
    public static void main(String[] args) {
        Titular titular = new Titular("Ayelen Masseroni", "39600348");
        Pasaporte pasaporte = new Pasaporte("AM39600348", "2025-10-10", "foto.jpg", "JPEG");
        titular.setPasaporte(pasaporte);
        System.out.println("Pasaporte número: " + pasaporte.getNumero());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }    
}
