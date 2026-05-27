package Taller9;

public class Empleado extends Persona {
    String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); // Llama al constructor de la clase base Persona
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método mostrarDetalles de la clase base Persona
        System.out.println("Departamento: " + departamento);
    }
}