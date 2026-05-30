package ejercicio2;

public class Estudiante extends Persona {

    private String matricula;
    private double promedio;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
        this.promedio = 0.0;
    }

    public Estudiante(String nombre, int edad, String matricula, double promedio) {
        super(nombre, edad);
        this.matricula = matricula;
        this.promedio = promedio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Promedio: " + promedio);
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando...");
    }

    public void presentarExamen(String materia, double calificacion) {
        System.out.println(nombre + " presentó el examen de " + materia);
        System.out.println("Calificación obtenida: " + calificacion);
        this.promedio = (this.promedio + calificacion) / 2;
    }

    public void asistirAClase(String materia) {
        System.out.println(nombre + " asistió a la clase de " + materia);
    }

    public void trabajarEnProyecto(String nombreProyecto) {
        System.out.println(nombre + " está trabajando en el proyecto: " + nombreProyecto);
    }

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
