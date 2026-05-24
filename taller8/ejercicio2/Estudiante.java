package ejercicio2;

/**
 * Clase que hereda de Persona y representa un estudiante
 */
public class Estudiante extends Persona {
    
    // Atributo específico del estudiante
    private String matricula;
    private double promedio;
    
    /**
     * Constructor de la clase Estudiante
     * @param nombre Nombre del estudiante
     * @param edad Edad del estudiante
     * @param matricula Número de matrícula
     */
    public Estudiante(String nombre, int edad, String matricula) {
        // Llamamos al constructor de la clase base
        super(nombre, edad);
        this.matricula = matricula;
        this.promedio = 0.0;
    }
    
    /**
     * Constructor sobrecargado con promedio
     */
    public Estudiante(String nombre, int edad, String matricula, double promedio) {
        super(nombre, edad);
        this.matricula = matricula;
        this.promedio = promedio;
    }
    
    /**
     * Sobrescribimos el método mostrarDetalles de Persona
     * Agregamos información específica del estudiante
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Promedio: " + promedio);
    }
    
    /**
     * Método específico del estudiante: estudiar
     */
    public void estudiar() {
        System.out.println(nombre + " está estudiando...");
    }
    
    /**
     * Método específico del estudiante: presentar examen
     */
    public void presentarExamen(String materia, double calificacion) {
        System.out.println(nombre + " presentó el examen de " + materia);
        System.out.println("Calificación obtenida: " + calificacion);
        // Actualizar promedio (simplificado)
        this.promedio = (this.promedio + calificacion) / 2;
    }
    
    /**
     * Método específico del estudiante: asistir a clase
     */
    public void asistirAClase(String materia) {
        System.out.println(nombre + " asistió a la clase de " + materia);
    }
    
    /**
     * Método específico del estudiante: trabajar en proyecto
     */
    public void trabajarEnProyecto(String nombreProyecto) {
        System.out.println(nombre + " está trabajando en el proyecto: " + nombreProyecto);
    }
    
    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }
    
    public double getPromedio() {
        return promedio;
    }
    
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}