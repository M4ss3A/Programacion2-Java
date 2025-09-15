/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico.pkg2;
import java.util.*;
/**
 *
 * @author Masse
 */
public class Ejercicio3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese su edad: ");
       int edad = sc.nextInt();
       String clase;
       if (edad < 12) clase = "Niño";
       else if (edad <= 17) clase = "Adolescente";
       else if (edad <= 59) clase = "Adulto";
       else clase = "Adulto mayor";
       System.out.println("Sos un " + clase + ".");
       sc.close();
} 
}
