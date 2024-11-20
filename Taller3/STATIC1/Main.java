package Taller3.STATIC1;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Focus");
        Coche coche4 = new Coche("Chevrolet", "Joy");

        Coche.mostrarContadorCoches(); 
    }
}
