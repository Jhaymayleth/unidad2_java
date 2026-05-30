package ejercicio1;

public class Vehiculo {

    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInfo() {
        System.out.println("--- Información del Vehículo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
