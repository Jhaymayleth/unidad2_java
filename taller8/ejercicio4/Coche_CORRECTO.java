package ejercicio4;

/**
 * CORRECTO: Usar getters para acceder a atributos privados
 * ✅ ESTO SÍ COMPILA
 */
public class Coche_CORRECTO extends Vehiculo {
    
    private int numeroDePuertas;
    
    public Coche_CORRECTO(String marca, String modelo, int ano, int velocidadMaxima, int numeroDePuertas) {
        super(marca, modelo, ano, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
    
    /**
     * CORRECTO: Usar getter para acceder a marca
     */
    public void mostrarMarca() {
        System.out.println("Marca: " + getMarca());  // ✅ USA GETTER
    }
    
    /**
     * CORRECTO: Usar getter para acceder a modelo
     */
    public void mostrarModelo() {
        System.out.println("Modelo: " + getModelo());  // ✅ USA GETTER
    }
    
    /**
     * CORRECTO: Usar getter para acceder a año
     */
    public void mostrarAno() {
        System.out.println("Año: " + getAno());  // ✅ USA GETTER
    }
    
    /**
     * CORRECTO: Acceder a atributo protegido de la clase base
     */
    public void mostrarVelocidad() {
        System.out.println("Velocidad Máxima: " + velocidadMaxima);  // ✅ protected
    }
    
    /**
     * Mostrar toda la información
     */
    public void mostrarInfo() {
        System.out.println("--- Información del Coche ---");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAno());
        System.out.println("Velocidad Máxima: " + velocidadMaxima);
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
}
