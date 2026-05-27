package Taller9;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Pez pez1 = new Pez("Salmón", "Agua Dulce");
        System.out.println("Detalles del Pez:");
        pez1.mostrarEspecie();

        System.out.println("\nDetalles del Animal (a través de Pez):");
        Animal animal1 = new Animal("León");
        animal1.mostrarEspecie();
    }
}