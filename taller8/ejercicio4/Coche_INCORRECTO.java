package ejercicio4;

/**
 * INCORRECTO: Intenta acceder a atributos privados
 * ❌ ESTO NO COMPILA - GENERA ERROR DE COMPILACIÓN
 */
public class Coche_INCORRECTO extends Vehiculo {
    
    private int numeroDePuertas;
    
    public Coche_INCORRECTO(String marca, String modelo, int ano, int velocidadMaxima, int numeroDePuertas) {
        super(marca, modelo, ano, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
    
    /**
     * INCORRECTO: Intentar acceder directamente a 'marca'
     */
    public void mostrarMarca() {
        // ❌ ERROR DE COMPILACIÓN: marca tiene acceso privado
        System.out.println("Marca: " + marca);  // ERROR aquí
    }
    
    /**
     * INCORRECTO: Intentar acceder directamente a 'modelo'
     */
    public void mostrarModelo() {
        // ❌ ERROR DE COMPILACIÓN: modelo tiene acceso privado
        System.out.println("Modelo: " + modelo);  // ERROR aquí
    }
    
    /**
     * INCORRECTO: Intentar acceder directamente a 'ano'
     */
    public void mostrarAno() {
        // ❌ ERROR DE COMPILACIÓN: ano tiene acceso privado
        System.out.println("Año: " + ano);  // ERROR aquí
    }
}