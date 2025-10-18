package tp7.ejercicio3;


public abstract class Empleado {
  
    public double calcularSueldo(Empleado e) {
        if (e instanceof EmpleadoPlanta) {
            return 900000.0;
        } else if (e instanceof EmpleadoTemporal) {
            return 850000.0;
        } else {
            return 0;
        }
    }
}
