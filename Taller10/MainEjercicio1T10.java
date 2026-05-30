package Taller10;

public class MainEjercicio1T10 {
    public static void main(String[] args) {
        PersonaT10 persona = new PersonaT10("Carlos");
        EstudianteT10 estudiante = new EstudianteT10("Ana", "Ingeniería de Software");
        ProfesorT10 profesor = new ProfesorT10("María", "Matemáticas");

        System.out.println("--- Demostración de Sobrescritura y Polimorfismo (Ejercicio 1) ---");

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();

        System.out.println("\n--- Polimorfismo ---");
        PersonaT10 p1 = new EstudianteT10("Pedro", "Diseño Gráfico");
        PersonaT10 p2 = new ProfesorT10("Laura", "Física");

        p1.presentarse(); // Llama al presentarse de EstudianteT10
        p2.presentarse(); // Llama al presentarse de ProfesorT10
    }
}
