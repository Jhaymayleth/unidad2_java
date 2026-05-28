package Taller11;

abstract class Empleado {
    protected String nombre;
    protected String id;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Método abstracto para calcular el salario, implementado por las subclases
    public abstract double calcularSalario();

    // Método concreto para mostrar detalles, utilizando el método abstracto
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: " + calcularSalario());
    }
}