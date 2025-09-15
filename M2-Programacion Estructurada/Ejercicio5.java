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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            int n = sc.nextInt();
            if (n == 0) break;
            if (n % 2 == 0) suma += n;
    }
    System.out.println("La suma de los números pares es: " + suma);
    }
}

