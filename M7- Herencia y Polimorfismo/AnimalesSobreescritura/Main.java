
package tp7.ejercicio4;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) { 
        ArrayList<Animal> animales = new ArrayList<>(); // Inicia array vacio

       // Agrega info al array
        Perro p1 = new Perro();
        Gato g1 = new Gato();
        Vaca v1 = new Vaca();

        animales.add(p1);
        animales.add(g1);
        animales.add(v1);

        // Recorre el array y llamamos al metodo 
        for (Animal a : animales) { 
            a.hacerSonido();
        }
    }
}
