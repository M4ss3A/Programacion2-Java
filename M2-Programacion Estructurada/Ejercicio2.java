/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico.pkg2;

import java.util.Scanner;

/**
 *
 * @author Masse
 */
public class Ejercicio2 {
   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           System.out.print("Ingrese el primer número: "); int a = sc.nextInt();
           System.out.print("Ingrese el segundo número: "); int b = sc.nextInt();
           System.out.print("Ingrese el tercer número: "); int c = sc.nextInt();
           int mayor = a;
           if (b > mayor) mayor = b;
           if (c > mayor) mayor = c;
           System.out.println("El mayor es: " + mayor);
        }
}  
}
