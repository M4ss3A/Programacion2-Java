
package tp7.ejercicio3;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
         // Inicia elarray
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        EmpleadoPlanta e1 = new EmpleadoPlanta();
        EmpleadoPlanta e2 = new EmpleadoPlanta();
        EmpleadoTemporal e3 = new EmpleadoTemporal();
        EmpleadoTemporal e4 = new EmpleadoTemporal();
        
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        
        int i = 1; 
        for(Empleado e : empleados) { // Recorre el array y  Llama al metodo
            System.out.println("Empleado " + i + "- Total a cobrar: " + e.calcularSueldo(e)); 
            i++; 
        } 
    }
}
