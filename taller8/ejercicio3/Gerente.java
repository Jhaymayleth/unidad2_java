package ejercicio3;

public class Gerente extends Empleado {

    private String departamento;
    private int empleadosAsuCargo;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
        this.empleadosAsuCargo = 0;
    }

    public Gerente(String nombre, double salario, String departamento, int empleadosAsuCargo) {
        super(nombre, salario);
        this.departamento = departamento;
        this.empleadosAsuCargo = empleadosAsuCargo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Gerente ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + String.format("%.2f", salario));
        System.out.println("Departamento: " + departamento);
        System.out.println("Empleados a su cargo: " + empleadosAsuCargo);
    }

    @Override
    public double calcularBono() {
        double bonoBase = salario * 0.15;
        double bonoEmpleados = salario * 0.02 * empleadosAsuCargo;
        return bonoBase + bonoEmpleados;
    }

    public void supervisar() {
        System.out.println(nombre + " está supervisando al equipo del departamento " + departamento);
    }

    public void asignarResponsabilidades(String tarea, String empleado) {
        System.out.println(nombre + " asignó la tarea '" + tarea + "' a " + empleado);
    }

    public void hacerReunion() {
        System.out.println(nombre + " está haciendo una reunión con su equipo del departamento " + departamento);
    }

    public void aprobarPresupuesto(double monto) {
        System.out.println(nombre + " aprobó un presupuesto de $" + String.format("%.2f", monto)
                + " para el departamento " + departamento);
    }

    public void darAscenso(String nombreEmpleado) {
        System.out.println(nombre + " le dio ascenso a " + nombreEmpleado);
    }

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
