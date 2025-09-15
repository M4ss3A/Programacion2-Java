
package trabajopractico.pkg3;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear mascota y cargar datos
        Mascota mascota1 = new Mascota();
        mascota1.setNombre("Pixie");
        mascota1.setEspecie("Perro");
        mascota1.setEdad(4);

        System.out.println("INFORMACION MASCOTA");
        mascota1.mostrarInfo();

        System.out.println("\nEdad y su cumpleaños");
        mascota1.cumplirAnios();

        System.out.println("\nINFORMACION FINAL");
        mascota1.mostrarInfo();
    }
}
//Clases
class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
// Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <0) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }
}
// Cumpleaños   
 public void cumplirAnios() {
        this.edad++;
        System.out.println("¡" + nombre + " cumplió años! Ahora tiene " + edad + ".");
}
// Informacion 
   public void mostrarInfo() {
        System.out.println("Mascota: " + nombre );
        System.out.println("Especie: " + especie );
        System.out.println("Edad: " + edad);
    }
}