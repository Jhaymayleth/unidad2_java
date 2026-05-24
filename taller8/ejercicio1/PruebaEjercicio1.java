package ejercicio1;
/**
 * Clase de prueba para Ejercicio 1: Vehículo y Coche
 */
public class PruebaEjercicio1 {
    
    public static void main(String[] args) {
        System.out.println("========== EJERCICIO 1: VEHÍCULO Y COCHE ==========\n");
        
        // Crear una instancia de Vehiculo
        System.out.println("1. Creando un Vehículo genérico:");
        Vehiculo vehiculoGenerico = new Vehiculo("Toyota", 180.0);
        vehiculoGenerico.mostrarInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Crear instancias de Coche
        System.out.println("2. Creando un Coche (heredando de Vehículo):");
        Coche miCoche = new Coche("BMW", 220.0, 4);
        miCoche.mostrarInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("3. Usando método específico del Coche:");
        miCoche.mostrarInfoCoche();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("4. Usando método específico del Coche (acelerar):");
        miCoche.acelerar();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Crear otro coche
        System.out.println("5. Creando otro Coche:");
        Coche otroCoche = new Coche("Ferrari", 340.0, 2);
        otroCoche.mostrarInfoCoche();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Demostrar polimorfismo
        System.out.println("6. Demostrando Polimorfismo:");
        Vehiculo vehiculo = new Coche("Mercedes", 250.0, 5);
        vehiculo.mostrarInfo(); // Usa el método de Coche, no de Vehiculo
        
        System.out.println("\n" + "=".repeat(50));
    }
}