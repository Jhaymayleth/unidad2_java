package Taller11;

public class MainEjercicio1T11 {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Clases Abstractas (Ejercicio 1) ---");

        // No se puede instanciar directamente una clase abstracta:
        // FiguraT11 figura = new FiguraT11("Figura Genérica"); // Esto daría un error de compilación

        CirculoT11 circulo = new CirculoT11("Círculo Grande", 5.0);
        RectanguloT11 rectangulo = new RectanguloT11("Rectángulo Pequeño", 4.0, 6.0);

        circulo.mostrarArea();
        rectangulo.mostrarArea();

        System.out.println("\n--- Polimorfismo con Clases Abstractas ---");
        FiguraT11 f1 = new CirculoT11("Círculo Mediano", 3.5);
        FiguraT11 f2 = new RectanguloT11("Rectángulo Largo", 8.0, 2.5);

        f1.mostrarArea();
        f2.mostrarArea();
    }
}