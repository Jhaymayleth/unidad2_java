package ejercicio2;

/**
 * Clase base que representa una persona
 */
public class Persona {
    
    // Atributos protegidos
    protected String nombre;
    protected int edad;
    
    /**
     * Constructor de la clase Persona
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /**
     * Método para mostrar los detalles de la persona
     */
    public void mostrarDetalles() {
        System.out.println("--- Detalles de la Persona ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
    
    /**
     * Método que simula un sonido de saludo
     */
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
    
    /**
     * Método que simula cumplir años
     */
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " acaba de cumplir " + edad + " años");
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
}