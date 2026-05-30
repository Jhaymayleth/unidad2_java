
package Taller11;

class Vendedor extends Empleado {
    private double salarioBase;
    private double comisionPorVentas;

    public Vendedor(String nombre, String id, double salarioBase, double comisionPorVentas) {
        super(nombre, id);
        this.salarioBase = salarioBase;
        this.comisionPorVentas = comisionPorVentas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comisionPorVentas;
    }
}
