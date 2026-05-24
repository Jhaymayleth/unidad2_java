package ejercicio4;

/**
 * Clase de prueba para Ejercicio 4: Uso Incorrecto de Herencia
 */
public class PruebaEjercicio4 {
    
    public static void main(String[] args) {
        System.out.println("========== EJERCICIO 4: USO INCORRECTO DE HERENCIA ==========\n");
        
        // ============ DEMOSTRACIÓN DE LA SOLUCIÓN 1 ============
        System.out.println("--- SOLUCIÓN 1: USANDO INTERFACES ---\n");
        
        System.out.println("❌ INCORRECTO: class C extends A, B { }");
        System.out.println("✅ CORRECTO:   class C extends A implements I { }\n");
        
        ClaseC_CORRECTO objC = new ClaseC_CORRECTO();
        objC.metodoA();
        objC.metodoB();
        objC.metodoC();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ DEMOSTRACIÓN DE LA SOLUCIÓN 2 ============
        System.out.println("--- SOLUCIÓN 2: USANDO GETTERS ---\n");
        
        System.out.println("❌ INCORRECTO: System.out.println(marca);");
        System.out.println("✅ CORRECTO:   System.out.println(getMarca());\n");
        
        Coche_CORRECTO miCoche = new Coche_CORRECTO("BMW", "X5", 2024, 220, 4);
        miCoche.mostrarInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ TABLA DE MODIFICADORES ============
        System.out.println("--- TABLA DE MODIFICADORES DE ACCESO ---\n");
        
        String[][] tabla = {
            {"Modificador", "Misma Clase", "Clase Derivada", "Mismo Paquete", "Otros"},
            {"public", "✅", "✅", "✅", "✅"},
            {"protected", "✅", "✅", "✅", "❌"},
            {"package-private", "✅", "❌", "✅", "❌"},
            {"private", "✅", "❌", "❌", "❌"}
        };
        
        for (String[] fila : tabla) {
            System.out.printf("%-20s | %-15s | %-20s | %-15s | %-10s%n", 
                            fila[0], fila[1], fila[2], fila[3], fila[4]);
        }
        
        System.out.println("\n" + "=".repeat(50));
    }
}