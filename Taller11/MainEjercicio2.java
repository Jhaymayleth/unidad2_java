package Taller11;

public class MainEjercicio2{
    public static void main(String[] args) {
        System.out.println("\n--- Demostración de Clases Abstractas (Ejercicio 2) ---");

        Gerente gerente = new Gerente("Laura Pérez", "G001", 5000.0, 1000.0);
        Vendedor vendedor = new Vendedor("Pedro Gómez", "V001", 2000.0, 500.0);

        System.out.println("Detalles del Gerente:");
        gerente.mostrarDetalles();

        System.out.println("\nDetalles del Vendedor:");
        vendedor.mostrarDetalles();

        System.out.println("\n--- Polimorfismo con Clases Abstractas ---");
        Empleado emp1 = new Gerente("Ana Ruiz", "G002", 5500.0, 1200.0);
        Empleado emp2 = new Vendedor("Juan López", "V002", 2200.0, 600.0);
        System.out.println("Detalles del Empleado (Gerente):");
        emp1.mostrarDetalles();

        System.out.println("\nDetalles del Empleado (Vendedor):");
        emp2.mostrarDetalles();
    }
}