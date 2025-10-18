
package tp7.ejercicio2;


public class Circulo extends Figura{ //Extencion
    
    private final double radio; // Declara atributo

    public Circulo(double radio, String nombre) { // Constructor
        super(nombre);
        this.radio = radio;
    }
    
    
    @Override
    public void calcularArea(){ // Sobreescribe el metodo 
        System.out.println("El area del cirulo " + nombre + " = " +  (radio *  3.14));
    }
}
