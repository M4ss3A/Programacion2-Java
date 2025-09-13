/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg1;

/**
 *
 * @author Masse
 */
import java.util.Scanner;
public class Error {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();   // ✔ leer texto con nextLine()

        System.out.println("Hola, " + nombre);
        scanner.close();
    }
}
