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

public class Ejercicio1 {
   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           System.out.print("Ingrese un año: ");
           int y = sc.nextInt();
           boolean esBisiesto = (y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0));
           if (esBisiesto) System.out.println("El año " + y + " es bisiesto.");
           else System.out.println("El año " + y + " no es bisiesto.");
       }
} 
}
