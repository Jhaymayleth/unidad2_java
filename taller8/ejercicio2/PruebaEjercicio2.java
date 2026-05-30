package ejercicio2;

/**
 * Clase de prueba para Ejercicio 2: Persona y Estudiante
 */
public class PruebaEjercicio2 {
    
    public static void main(String[] args) {
        System.out.println("========== EJERCICIO 2: PERSONA Y ESTUDIANTE ==========\n");
        
        // Crear una instancia de Persona
        System.out.println("1. Creando una Persona genérica:");
        Persona persona = new Persona("Juan García", 35);
        persona.mostrarDetalles();
        persona.saludar();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Crear instancias de Estudiante
        System.out.println("2. Creando un Estudiante (heredando de Persona):");
        Estudiante estudiante1 = new Estudiante("María López", 20, "A202400123");
        estudiante1.mostrarDetalles();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("3. Usando métodos específicos del Estudiante:");
        estudiante1.saludar(); // Método heredado de Persona
        estudiante1.estudiar();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("4. Simulando actividades del estudiante:");
        estudiante1.asistirAClase("Programación");
        estudiante1.presentarExamen("Programación", 85.5);
        estudiante1.trabajarEnProyecto("Sistema de Gestión");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Crear otro estudiante con promedio inicial
        System.out.println("5. Creando otro Estudiante con promedio:");
        Estudiante estudiante2 = new Estudiante("Carlos Rodríguez", 22, "B202400456", 78.0);
        estudiante2.mostrarDetalles();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("6. Actualizando datos del estudiante 2:");
        estudiante2.presentarExamen("Bases de Datos", 90.0);
        System.out.println("Nuevo promedio: " + estudiante2.getPromedio());
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("7. Método heredado: cumplir años");
        estudiante1.cumplirAnios();
        System.out.println("Nueva edad de " + estudiante1.getNombre() + ": " + estudiante1.getEdad());
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Demostrando polimorfismo
        System.out.println("8. Demostrando Polimorfismo:");
        Persona[] personas = new Persona[3];
        personas[0] = new Persona("Ana García", 40);
        personas[1] = new Estudiante("Pedro Martínez", 21, "C202400789");
        personas[2] = new Estudiante("Laura Fernández", 19, "D202400321", 88.5);
        
        System.out.println("\nMostrando detalles de todas las personas:");
        for (int i = 0; i < personas.length; i++) {
            personas[i].mostrarDetalles();
            System.out.println();
        }
        
        System.out.println("=".repeat(50));
    }
}
