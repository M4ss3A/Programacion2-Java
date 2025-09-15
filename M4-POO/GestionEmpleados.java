package gestionempleados;

public class GestionEmpleados {
    public static void main(String[] args) {
// Instancias (sobrecarga de constructores
        Empleado e1 = new Empleado(5, "Joe Venka", "Programador", 80000); 
        Empleado e2 = new Empleado("Sebastian Martinez", "Infraestructura");            
        Empleado e3 = new Empleado("Sol Pux", "Tester");   
 
        
// Informacion de empleados
        System.out.println("ESTADO ACTUAL");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString()); 
   
// Total de empleados
        System.out.println("\nTOTAL DE EMPLEADOS: " + Empleado.mostrarTotalEmpleados());
        
// Porcentajes que le corresponden a cada empleado
      double pctE1 = 15.0;
      double pctE2 = 15.0;
      double pctE3 = 1.0;  
   
//Aumento y resultado 
        System.out.println("\nAUMENTO APLICADO- NUEVO SALARIO");
        e1.actualizarSalario(pctE1); // sobrecarga double
        System.out.println(e1.getNombre() + " (+" + pctE1 + "%) -> $" + e1.getSalario());

        e2.actualizarSalario(pctE2);
        System.out.println(e2.getNombre() + " (+" + pctE2 + "%) -> $" + e2.getSalario());

        e3.actualizarSalario(pctE3);
        System.out.println(e3.getNombre() + " (+" + pctE3 + "%) -> $" + e3.getSalario());
       
        
    }
}