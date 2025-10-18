
package tp7.pkg1;


public class Auto extends Vehiculo { // Extiende de la clase vehiculo
    private int cantidadDePuertas; // Metodo adicional de clase auto

    
    public Auto(int cantidadDePuertas, String marca, String modelo) {// Creacion  del constructor llamando al constructor de la clase padre
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }
    @Override
    public void mostrarInfo(){ // informacion sobreescrita
        System.out.println("Modelo: " + this.modelo +  "Marca: " + this.marca + "Cantidad de puertas: " + cantidadDePuertas);
    }
    
}
