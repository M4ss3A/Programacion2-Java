package tp5.ejercicio10;


public class Main10 {
    public static void main(String[] args) {
        Titular titular = new Titular("Ayelen Masseroni", "39600348");
        CuentaBancaria cuenta = new CuentaBancaria("111555566669888", 500000.0, "1234", "1/10/2028");
        titular.setCuenta(cuenta);
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());
    }
}
