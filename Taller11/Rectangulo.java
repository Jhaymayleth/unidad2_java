package Taller11;

class RectanguloT11 extends FiguraT11 {
    private double base;
    private double altura;

    public RectanguloT11(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}