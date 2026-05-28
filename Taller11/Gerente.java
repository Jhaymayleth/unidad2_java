package Taller11;

class Gerente extends Empleado {
    private double salarioBase;
    private double bono;

    public Gerente(String nombre, String id, double salarioBase, double bono) {
        super(nombre, id);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}