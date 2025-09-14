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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int x = sc.nextInt();
            if (x > 0) pos++; 
            else if (x < 0) neg++; 
            else ceros++;
        }
        System.out.println("Resultados:\nPositivos: " + pos +
                   "\nNegativos: " + neg +
                   "\nCeros: " + ceros);
}
}
