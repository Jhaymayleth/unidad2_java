package Taller11;

abstract class FiguraT11 {
    protected String nombre;

    public FiguraT11(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract double calcularArea();

    // Método concreto que utiliza el método abstracto
    public void mostrarArea() {
        System.out.println("El área de " + nombre + " es: " + calcularArea());
    }
}
