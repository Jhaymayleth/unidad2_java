package Taller7.ejercicio_1;

/**
 * Clase que representa un empleado con propiedades nombre y salario
 * Demuestra el uso correcto del modificador public
 */
public class Empleado {
    
    // ✅ Atributo PÚBLICO: nombre es accesible directamente
    public String nombre;
    
    // ✅ Atributo PRIVADO: salario está protegido
    private double salario;
    
    /**
     * Constructor público de la clase Empleado
     * @param nombre Nombre del empleado
     * @param salario Salario inicial del empleado
     */
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        // Usamos el setter para aplicar validación
        setSalario(salario);
    }
    
    /**
     * Método GET público para obtener el salario
     * @return El salario del empleado
     */
    public double getSalario() {
        return salario;
    }
    
    /**
     * Método SET público para establecer el salario
     * ✅ Incluye validación: el salario debe ser positivo
     * @param nuevoSalario El nuevo salario del empleado
     */
    public void setSalario(double nuevoSalario) {
        if (nuevoSalario > 0) {
            this.salario = nuevoSalario;
            System.out.println("✅ Salario actualizado correctamente: $" + 
                             String.format("%.2f", nuevoSalario));
        } else {
            System.out.println("❌ Error: El salario debe ser mayor a 0. " +
                             "Salario no actualizado.");
        }
    }
    
    /**
     * Método para mostrar la información completa del empleado
     */
    public void mostrarInformacion() {
        System.out.println("\n--- Información del Empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + String.format("%.2f", salario));
    }
    
    /**
     * Método para calcular el bono anual (10% del salario)
     * @return El bono anual
     */
    public double calcularBonoAnual() {
        return salario * 0.10;
    }
    
    /**
     * Método para aumentar el salario por porcentaje
     * @param porcentaje El porcentaje de aumento
     */
    public void aumentarSalario(double porcentaje) {
        if (porcentaje > 0) {
            double aumento = salario * (porcentaje / 100);
            double nuevoSalario = salario + aumento;
            setSalario(nuevoSalario);
        } else {
            System.out.println("❌ Error: El porcentaje debe ser mayor a 0.");
        }
    }
}
