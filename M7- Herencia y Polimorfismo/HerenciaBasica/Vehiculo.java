
package tp7.pkg1;


public class Vehiculo {
    // Declaracion protegida de los atributos de la clase padre
    protected String marca; 
    protected String modelo;

    public Vehiculo(String marca, String modelo) { // Creacion del constructor
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo(){ // Mostrar informacion de vehiculo
        System.out.println("Modelo: " + modelo + " | marca: " + marca);
    }
}
