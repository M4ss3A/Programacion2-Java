
package trabajopractico.pkg3;

public class Ejercicio1 {
        
    public static void main(String[] args) {
        //Crear estudiante y cargar datos
        Estudiante estudiante1=new Estudiante();
        estudiante1.setNombre("Ayelen");
        estudiante1.setApellido("Masseroni");
        estudiante1.setCurso("Programacion");
        estudiante1.setCalificacion( 4 );
        
        System.out.println("INFORMACION");
        estudiante1.mostrarInfo();
        
        System.out.println("Subir 3 puntos de calificacion:");
        estudiante1.subirCalificacion(3);
        
        System.out.println("Bajar 1 punto de calificacion");
        estudiante1.bajarCalificacion(1);
    }   
}
//Clases
class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

// Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double calificacion) {
        if(calificacion <0){
            this.calificacion = 0;
        } else if (calificacion > 10) {
            this.calificacion = 10;
        } else{
            this.calificacion = calificacion;
    }
}

//Aumentar calificacion
    public void subirCalificacion (double puntos){
        if(calificacion + puntos<=10) {
            calificacion += puntos;
            System.out.println("La calificacion aumento a: " + calificacion);
        }else{
            System.out.println("Error, la calificacion maxima es 10");
    }
}    
//Bajar Calificacion
    public void bajarCalificacion(double puntos){
        if(calificacion - puntos>=0) {
        calificacion -= puntos;
            System.out.println("La calificacion disminuido a: " + calificacion);
        } else {
            System.out.println("Eror, no hay calificacion menor a 0");  
    }
}


// Mostrar informacion estudiante
    public void mostrarInfo(){
        System.out.println("Estudiante: " + apellido + " , " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion );
    }
}


    