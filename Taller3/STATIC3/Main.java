package Taller3.STATIC3;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Banco
        Banco banco = new Banco(1000.0);

        // Mostrar el saldo inicial
        banco.mostrarSaldo(); // Debería mostrar: Saldo actual: 1000.0

        // Intentar modificar el saldo usando el método estático
        // Esto dara un error de compilación, así que lo comentamos
        // Banco.modificarSaldo(2000.0); // Descomentar para ver el error

        // Entonces, utilizamos un método de instancia para modificar el saldo
       
    }
}