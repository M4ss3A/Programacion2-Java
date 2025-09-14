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
public class Ejercicio11 {
    static double DESCUENTO_ESPECIAL = 0.10; // 10%
    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        return precio - descuentoAplicado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        double finalConDesc = calcularDescuentoEspecial(precio);
        System.out.println("El precio final con descuento es: " + finalConDesc);
        sc.close();
    }
}
