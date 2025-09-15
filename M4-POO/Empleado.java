
package gestionempleados;

public class Empleado {
// Atributos encapsulados
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

// Getters y Setters   
    public int getId() {
        return id;}

    public void setId(int id) {
        this.id = id;}

    public String getNombre() {
        return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public double getSalario() {
        return salario;}

    public void setSalario(double salario) {
        this.salario = salario;}
 
    
// Atributos estaticos 
    private static int totalEmpleados = 0; // contador de empleados creados
    private static int siguienteId = 1;    // generador de ID automático


// Constructor completo- recibe todos los datos
    public Empleado(int id, String nombre, String puesto, double salario) {
        // this para distinguir parámetros de atributos
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;// Actualizamos el contador estatico global 
    }
// Constructor- ID auto y salario por defecto
    public Empleado(String nombre, String puesto){
        this.id = siguienteId;   // usa el contador estatico
        siguienteId = siguienteId + 1; // avanza el contador
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000.0;  // salario por defecto 
        totalEmpleados++;
    }
// Métodos sobrecargados para actualizar el salario
    // Porcentaje 
    public void actualizarSalario(double porcentaje) {
        this.salario = this.salario + (this.salario * (porcentaje / 100));
    }
    // Monto fijo 
    public void actualizarSalario(int montoFijo) {
        this.salario = this.salario + montoFijo;
    }

    // toString(): representación legible del objeto
    @Override
    public String toString() {
        return" ID:" + id +
               " NOMBRE: " + nombre + "|"+
               " PUESTO: " + puesto + "|" +
               " SUELDO ACTUAL: " + salario ;
    }

    // Método estático para consultar cuántos empleados se crearon
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}