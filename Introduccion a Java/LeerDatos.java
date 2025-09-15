
package trabajo.practico.pkg1;

/**
 *
 * @author Masse
 */

import java.util.Scanner;
public class LeerDatos {
     public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
             System.out.print("Ingresa tu nombre: ");
             String nombre = sc.nextLine();   
             
             System.out.print("Ingresa tu edad: ");
             int edad = sc.nextInt();         
             
             System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
         }
    }
}
