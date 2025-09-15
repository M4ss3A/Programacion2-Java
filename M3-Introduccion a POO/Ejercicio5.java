
package trabajopractico.pkg3;

public class Ejercicio5 {
     public static void main(String[] args) {
        // Crear nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Andromeda");
        nave.setCombustible(50);

        System.out.println("ESTADO INICIAL ");
        nave.mostrarEstado();

        // Intentar avanzar "sin recargar" lo suficiente (debería avisar insuficiente si pedimos mucho)
        System.out.println("\nINTENTO DE AVANCE SIN RECARGAR (60) ");
        nave.despegar();
        nave.avanzar(60); // con 50 no alcanza

        // Recargar y volver a intentar
        System.out.println("\nRECARGA DE COMBUSTIBLE (30) ");
        nave.recargarCombustible(30);

        System.out.println("\nAVANCE CORRECTO (60) ");
        nave.avanzar(60);

        System.out.println("\nESTADO FINAL ");
        nave.mostrarEstado();
    }
}

// Clase 
class NaveEspacial {
    private String nombre;
    private int combustible;

    // Capacidad máxima para validar recargas
    private static final int CAPACIDAD_MAX = 100;

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }
    public void setCombustible(int combustible) {
        // normalizamos a rango 0..CAPACIDAD_MAX
        if (combustible < 0) {
            this.combustible = 0;
        } else if (combustible > CAPACIDAD_MAX) {
            this.combustible = CAPACIDAD_MAX;
        } else {
            this.combustible = combustible;
        }
    }

    // Métodos requeridos
    public void despegar() {
        if (combustible > 0) {
            System.out.println(nombre + " despegando");
        } else {
            System.out.println(nombre + " sin combustible. No puede despegar.");
        }
    }

    // 1 unidad de combustible por 1 unidad de distancia
    public void avanzar(int distancia) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser positiva.");
            return;
        }

        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente. Necesita " + distancia + " y hay " + combustible + ".");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }

        int nuevoNivel = combustible + cantidad;
        if (nuevoNivel > CAPACIDAD_MAX) {
            int agregadoReal = CAPACIDAD_MAX - combustible;
            combustible = CAPACIDAD_MAX;
            System.out.println("Se recargó " + agregadoReal + " (tope alcanzado: " + CAPACIDAD_MAX + ").");
        } else {
            combustible = nuevoNivel;
            System.out.println("Se recargó " + cantidad + ".");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + CAPACIDAD_MAX);
    }
}

