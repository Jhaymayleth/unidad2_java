package ejercicio3;

/**
 * Clase que hereda de Empleado y representa un gerente
 */
public class Gerente extends Empleado {
    
    // Atributo específico del gerente
    private String departamento;
    private int empleadosAsuCargo;
    
    /**
     * Constructor de la clase Gerente
     * @param nombre Nombre del gerente
     * @param salario Salario del gerente
     * @param departamento Departamento que dirige
     */
    public Gerente(String nombre, double salario, String departamento) {
        // Llamamos al constructor de la clase base
        super(nombre, salario);
        this.departamento = departamento;
        this.empleadosAsuCargo = 0;
    }
    
    /**
     * Constructor sobrecargado con empleados a cargo
     */
    public Gerente(String nombre, double salario, String departamento, int empleadosAsuCargo) {
        super(nombre, salario);
        this.departamento = departamento;
        this.empleadosAsuCargo = empleadosAsuCargo;
    }
    
    /**
     * Sobrescribimos el método mostrarDetalles de Empleado
     * Agregamos información específica del gerente
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Gerente ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + String.format("%.2f", salario));
        System.out.println("Departamento: " + departamento);
        System.out.println("Empleados a su cargo: " + empleadosAsuCargo);
    }
    
    /**
     * Sobrescribimos el método calcularBono
     * El gerente recibe un bono mayor (15% del salario)
     */
    @Override
    public double calcularBono() {
        // Bono base del 15% más 2% por cada empleado a cargo
        double bonoBase = salario * 0.15;
        double bonoEmpleados = salario * 0.02 * empleadosAsuCargo;
        return bonoBase + bonoEmpleados;
    }
    
    /**
     * Método específico del gerente: supervisar
     */
    public void supervisar() {
        System.out.println(nombre + " está supervisando al equipo del departamento " + departamento);
    }
    
    /**
     * Método específico del gerente: asignar responsabilidades
     */
    public void asignarResponsabilidades(String tarea, String empleado) {
        System.out.println(nombre + " asignó la tarea '" + tarea + "' a " + empleado);
    }
    
    /**
     * Método específico del gerente: hacer reunión
     */
    public void hacerReunion() {
        System.out.println(nombre + " está haciendo una reunión con su equipo del departamento " + departamento);
    }
    
    /**
     * Método específico del gerente: aprobar presupuesto
     */
    public void aprobarPresupuesto(double monto) {
        System.out.println(nombre + " aprobó un presupuesto de $" + String.format("%.2f", monto) + 
                         " para el departamento " + departamento);
    }
    
    /**
     * Método para dar ascenso a un empleado
     */
    public void darAscenso(String nombreEmpleado) {
        System.out.println(nombre + " le dio ascenso a " + nombreEmpleado);
    }
    
    // Getters y Setters
    public String getDepartamento() {
        return departamento;
    }
    
    public int getEmpleadosAsuCargo() {
        return empleadosAsuCargo;
    }
    
    public void setEmpleadosAsuCargo(int empleadosAsuCargo) {
        this.empleadosAsuCargo = empleadosAsuCargo;
    }
}
