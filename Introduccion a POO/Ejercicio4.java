
package trabajopractico.pkg3;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear dos gallinas y cargar datos 
        Gallina g1 = new Gallina();
        g1.setIdGallina(1);
        g1.setEdad(1);          // años
        g1.setHuevosPuestos(0); // empieza en 0 

        Gallina g2 = new Gallina();
        g2.setIdGallina(2);
        g2.setEdad(4);
        g2.setHuevosPuestos(0);

        System.out.println("ESTADO INICIAL");
        g1.mostrarEstado();
        g2.mostrarEstado();

        // Simular acciones: envejecer y poner huevos
        System.out.println("\nSIMULACION ");
        g1.envejecer();
        g1.ponerHuevo();


        g2.envejecer();
        g2.ponerHuevo();

        // Mostrar estado final
        System.out.println("\nESTADO FINAL");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
// Clase 
class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

// Métodos requeridos
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina #" + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("Gallina #" + idGallina + " cumplió años. Edad: " + edad);
    }

    public void mostrarEstado() {
        System.out.println("Gallina #" + idGallina + " | Edad: " + edad + " | Huevos puestos: " + huevosPuestos);
    }
}   


