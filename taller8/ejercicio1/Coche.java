package ejercicio1;
/**
 * Clase que hereda de Vehiculo y representa un coche específico
 */
public class Coche extends Vehiculo {
    
    // Atributo nuevo específico del coche
    private int numeroDePuertas;
    
    /**
     * Constructor de la clase Coche
     * @param marca Marca del vehículo
     * @param velocidadMaxima Velocidad máxima en km/h
     * @param numeroDePuertas Número de puertas del coche
     */
    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        // Llamamos al constructor de la clase base usando super
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
    
    /**
     * Método que extiende mostrarInfo con información específica del coche
     */
    @Override
    public void mostrarInfo() {
        // Llamamos al método de la clase base
        super.mostrarInfo();
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
    
    /**
     * Método específico del coche
     */
    public void mostrarInfoCoche() {
        System.out.println("\n--- Información Completa del Coche ---");
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
    
    /**
     * Método específico del coche para acelerar
     */
    public void acelerar() {
        System.out.println("El coche " + marca + " está acelerando...");
    }
    
    // Getter
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
}
