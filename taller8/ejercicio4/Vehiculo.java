package ejercicio4;

/**
 * Clase base con atributo privado
 */
public class Vehiculo {
    
    // Atributos PRIVADOS (no accesibles desde clases derivadas)
    private String marca;
    private String modelo;
    private int ano;
    
    // Atributo PROTEGIDO (accesible desde clases derivadas)
    protected int velocidadMaxima;
    
    /**
     * Constructor
     */
    public Vehiculo(String marca, String modelo, int ano, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    // Getters para acceder a los atributos privados
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAno() {
        return ano;
    }
}