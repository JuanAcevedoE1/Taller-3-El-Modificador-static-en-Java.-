package Taller3.STATIC3;

public class Banco {
    private double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public static void modificarSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo; // Eso sería un Error: no se puede acceder a 'saldo' desde un contexto estático
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}