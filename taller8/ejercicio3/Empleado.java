package ejercicio3;

public class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("--- Detalles del Empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + String.format("%.2f", salario));
    }

    public double calcularBono() {
        return salario * 0.10;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando...");
    }

    public void registrarAsistencia() {
        System.out.println(nombre + " ha llegado a trabajar");
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
