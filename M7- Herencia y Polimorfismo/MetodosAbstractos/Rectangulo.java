
package tp7.ejercicio2;


public class Rectangulo extends Figura{ // Extencion
    // Atributos 
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura, String nombre) { // Constructor
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(){ //Sobreescribe el metodo
        System.out.println("El area del rectangulo " + nombre + " es: " +  (base * altura));
    }
}
