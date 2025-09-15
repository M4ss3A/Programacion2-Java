
package trabajopractico.pkg3;

import java.time.Year;

public class Ejercicio3 {    
    public static void main(String[] args) {
        //Crear libro y cargar datos
        Libro libro1 = new Libro();
        libro1.setTitulo("Orgullo y prejuicio");
        libro1.setAutor("Jane Austen");
        libro1.setAnioPublicacion(1813); //Año valido
        System.out.println("INFORMACION INICIAL");
        libro1.mostrarInfo();

        // Intentar modificar con año inválido 
        System.out.println("\nIntento de cambio a año inválido 3000");
        libro1.setAnioPublicacion(3000); //Año invalido, no cambia
        libro1.mostrarInfo();

        // Cambiar a un año válido
        System.out.println("\nCambio a año válido: ");
        libro1.setAnioPublicacion(1796); // válido, cambia
        System.out.println("\nINFORMACION FINAL: ");
        libro1.mostrarInfo();
    }
}
// Clase
class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

// Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

// Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }

// Setter con validación: entre 1450 y año actual
    public void setAnioPublicacion(int anio) {
        int actual = Year.now().getValue();
        int minimo = 1450;
        if (anio < minimo || anio > actual) {
            System.out.println("Año inválido: " + anio +
                ". Debe estar entre " + minimo + " y " + actual + ". No se modifica.");
            return; // No cambia el valor si es inválido
        }
        this.anioPublicacion = anio;
    }

// Información del libro
    public void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" de " + autor +
                           " (" + anioPublicacion + ")");
    }
}