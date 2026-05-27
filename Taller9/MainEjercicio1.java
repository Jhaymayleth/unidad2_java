package Taller9;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 30, "Ventas");
        System.out.println("Detalles del Empleado:");
        empleado1.mostrarDetalles();

        System.out.println("\nDetalles de la Persona (a través de Empleado):");
        Persona persona1 = new Persona("Maria", 25);
        persona1.mostrarDetalles();
    }
}