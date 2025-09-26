package tp5.ejercicio9;


public class Main9 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Ayelen Masseroni", "Medicus");
        Profesional profesional = new Profesional("Dr.Jhon J", "Clinico");
        CitaMedica cita = new CitaMedica("1/9/2027", "13:00");
        cita.setProfesional(profesional);
        cita.setPaciente(paciente);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
    }
}











