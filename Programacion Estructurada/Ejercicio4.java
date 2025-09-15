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
public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el precio del producto: ");
            double precio = sc.nextDouble();
            System.out.print("Ingrese la categoría del producto (A, B o C): ");
            String cat = sc.next().trim().toUpperCase();
            double pct;
            switch (cat) {
                case "A" -> pct = 10;
                case "B" -> pct = 15;
                case "C" -> pct = 20;
                default -> {
                    System.out.println("Categoría inválida."); sc.close(); return;
                }
            }
            double descuento = precio * pct / 100.0;
            double finalPrecio = precio - descuento;
            System.out.println("Descuento aplicado: " + pct + "%");
            System.out.println("Precio final: " + finalPrecio);
        }
}
}
