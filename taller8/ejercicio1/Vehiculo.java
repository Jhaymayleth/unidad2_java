package ejercicio1;
/**
 * Clase base que representa un vehículo genérico
 */
public class Vehiculo {
    
    // Atributos protegidos para que sean accesibles desde clases derivadas
    protected String marca;
    protected double velocidadMaxima;
    
    /**
     * Constructor de la clase Vehiculo
     * @param marca Marca del vehículo
     * @param velocidadMaxima Velocidad máxima del vehículo en km/h
     */
    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    /**
     * Método para mostrar información del vehículo
     */
    public void mostrarInfo() {
        System.out.println("--- Información del Vehículo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
    
    // Getters
    public String getMarca() {
        return marca;
    }
    
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
