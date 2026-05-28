package Taller11;

class CirculoT11 extends FiguraT11 {
    private double radio;

    public CirculoT11(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}