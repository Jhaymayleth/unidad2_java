package ejercicio3;

/**
 * Clase base que representa un empleado
 */
public class Empleado {
    
    // Atributos protegidos
    protected String nombre;
    protected double salario;
    
    /**
     * Constructor de la clase Empleado
     * @param nombre Nombre del empleado
     * @param salario Salario mensual del empleado
     */
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    /**
     * Método para mostrar los detalles del empleado
     */
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + String.format("%.2f", salario));
    }
    
    /**
     * Método para calcular el bono anual del empleado (10% del salario)
     * @return El bono anual
     */
    public double calcularBono() {
        return salario * 0.10;
    }
    
    /**
     * Método para realizar trabajo
     */
    public void trabajar() {
        System.out.println(nombre + " está trabajando...");
    }
    
    /**
     * Método para registrar entrada
     */
    public void registrarAsistencia() {
        System.out.println(nombre + " ha llegado a trabajar");
    }
    
    // Getters y Setters
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
