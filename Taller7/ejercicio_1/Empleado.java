package Taller7.ejercicio_1;

public class Empleado {

    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

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

    public void mostrarInformacion() {
        System.out.println("\n--- Información del Empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + String.format("%.2f", salario));
    }

    public double calcularBonoAnual() {
        return salario * 0.10;
    }

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
