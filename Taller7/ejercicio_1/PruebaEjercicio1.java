package Taller7.ejercicio_1;

/**
 * Clase de prueba para Ejercicio 1: Clase Empleado
 * Demuestra el uso de atributos públicos y métodos públicos
 * con validación en setters
 */
public class PruebaEjercicio1 {
    
    public static void main(String[] args) {
        System.out.println("========== EJERCICIO 1: CLASE EMPLEADO ==========\n");
        
        // ============ CREANDO EMPLEADOS ============
        System.out.println("1. Creando empleados:");
        System.out.println("=".repeat(50) + "\n");
        
        Empleado emp1 = new Empleado("Juan García", 2500.0);
        emp1.mostrarInformacion();
        
        System.out.println();
        
        Empleado emp2 = new Empleado("María López", 3000.0);
        emp2.mostrarInformacion();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ ACCEDIENDO A ATRIBUTO PÚBLICO ============
        System.out.println("2. Accediendo directamente al atributo público 'nombre':");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Nombre de emp1: " + emp1.nombre);
        System.out.println("Nombre de emp2: " + emp2.nombre);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ MODIFICANDO ATRIBUTO PÚBLICO ============
        System.out.println("3. Modificando directamente el atributo público 'nombre':");
        System.out.println("=".repeat(50) + "\n");
        
        emp1.nombre = "Juan Carlos García";
        System.out.println("Nuevo nombre de emp1: " + emp1.nombre);
        emp1.mostrarInformacion();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ USANDO GETTER PARA OBTENER SALARIO ============
        System.out.println("4. Usando getter para obtener el salario (privado):");
        System.out.println("=".repeat(50) + "\n");
        
        double salarioEmp1 = emp1.getSalario();
        double salarioEmp2 = emp2.getSalario();
        
        System.out.println("Salario de emp1: $" + String.format("%.2f", salarioEmp1));
        System.out.println("Salario de emp2: $" + String.format("%.2f", salarioEmp2));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ USANDO SETTER CON VALIDACIÓN ============
        System.out.println("5. Usando setter con validación:");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Intentando establecer un salario válido (3500):");
        emp1.setSalario(3500.0);
        
        System.out.println("\nIntentando establecer un salario inválido (-1000):");
        emp1.setSalario(-1000.0);
        
        System.out.println("\nIntentando establecer un salario inválido (0):");
        emp1.setSalario(0);
        
        System.out.println("\nIntentando establecer un salario válido (2800):");
        emp1.setSalario(2800.0);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ INFORMACIÓN ACTUALIZADA ============
        System.out.println("6. Información actualizada:");
        System.out.println("=".repeat(50));
        
        emp1.mostrarInformacion();
        emp2.mostrarInformacion();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ CALCULANDO BONO ANUAL ============
        System.out.println("7. Calculando bono anual (10% del salario):");
        System.out.println("=".repeat(50) + "\n");
        
        double bonoEmp1 = emp1.calcularBonoAnual();
        double bonoEmp2 = emp2.calcularBonoAnual();
        
        System.out.println("Bono anual de emp1: $" + String.format("%.2f", bonoEmp1));
        System.out.println("Bono anual de emp2: $" + String.format("%.2f", bonoEmp2));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ AUMENTANDO SALARIO POR PORCENTAJE ============
        System.out.println("8. Aumentando salario por porcentaje (5%):");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Salario actual de emp2: $" + String.format("%.2f", emp2.getSalario()));
        emp2.aumentarSalario(5);
        System.out.println("Nuevo salario de emp2: $" + String.format("%.2f", emp2.getSalario()));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ RESUMEN FINAL ============
        System.out.println("9. Resumen final de empleados:");
        System.out.println("=".repeat(50));
        
        emp1.mostrarInformacion();
        emp2.mostrarInformacion();
        
        System.out.println("\n" + "=".repeat(50));
    }
}
