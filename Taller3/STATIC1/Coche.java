package Taller3.STATIC1;

public class Coche {
    private static int contadorCoches = 0;

    private String marca;
    private String modelo;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; 
    }

    public static void mostrarContadorCoches() {
        System.out.println("Número de coches creados: " + contadorCoches);
    }
}
