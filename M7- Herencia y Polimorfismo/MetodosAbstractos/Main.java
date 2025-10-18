
package tp7.ejercicio2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();// Crea un array vacio 
        
        // Crea y agrega 4 figuras al array
        Rectangulo r1 = new Rectangulo(4.0,  4.0, "Rectangulo 1");
        Rectangulo r2 = new Rectangulo(6.0,  4.0, "Rectangulo 2");
        Circulo c1 = new Circulo(10, "Circulo 1");
        Circulo c2 = new Circulo(15, "Circulo 2");
        
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(c1);
        figuras.add(c2);
         
        for(Figura f : figuras){// Recorre el array y llama al metodo calcular area
            f.calcularArea();
        }
    }
}
