package Taller3.STATIC2;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int suma = Matematicas.sumar(a, b);
        int resta = Matematicas.restar(a, b);
        int multiplicacion = Matematicas.multiplicar(a, b);
        double division = Matematicas.dividir(a, b);

        System.out.println("Suma: " + suma); 
        System.out.println("Resta: " + resta); 
        System.out.println("Multiplicación: " + multiplicacion); 
        System.out.println("División: " + division); 
    }
}