package tp5.ejercicio7;


public class Main7 {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Ayelen Masseroni", "12345");
        Motor motor = new Motor("Nafta", "M2222");
        Vehiculo vehiculo = new Vehiculo("AB122CF", "Ford Focus", motor);
        conductor.setVehiculo(vehiculo);

        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());  
    }
}
