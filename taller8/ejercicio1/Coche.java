package ejercicio1;

public class Coche extends Vehiculo {

    private int numeroDePuertas;

    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }

    public void mostrarInfoCoche() {
        System.out.println("\n--- Información Completa del Coche ---");
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }

    public void acelerar() {
        System.out.println("El coche " + marca + " está acelerando...");
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
}