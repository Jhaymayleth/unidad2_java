package ejercicio3;

/**
 * Clase de prueba para Ejercicio 3: Empleado y Gerente
 */
public class PruebaEjercicio3 {
    
    public static void main(String[] args) {
        System.out.println("========== EJERCICIO 3: EMPLEADO Y GERENTE ==========\n");
        
        // Crear instancias de Empleado
        System.out.println("1. Creando empleados regulares:");
        Empleado empleado1 = new Empleado("Roberto Pérez", 2000.0);
        Empleado empleado2 = new Empleado("Sofia Torres", 2500.0);
        
        empleado1.mostrarDetalles();
        System.out.println("Bono anual: $" + String.format("%.2f", empleado1.calcularBono()));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("2. Segundo empleado:");
        empleado2.mostrarDetalles();
        System.out.println("Bono anual: $" + String.format("%.2f", empleado2.calcularBono()));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Crear instancias de Gerente
        System.out.println("3. Creando un Gerente (heredando de Empleado):");
        Gerente gerente1 = new Gerente("Alejandro López", 5000.0, "Recursos Humanos");
        gerente1.mostrarDetalles();
        System.out.println("Bono anual: $" + String.format("%.2f", gerente1.calcularBono()));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("4. Gerente con empleados a cargo:");
        Gerente gerente2 = new Gerente("Mariana González", 6000.0, "Tecnología", 8);
        gerente2.mostrarDetalles();
        System.out.println("Bono anual: $" + String.format("%.2f", gerente2.calcularBono()));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("5. Usando métodos específicos del Gerente:");
        gerente1.hacerReunion();
        gerente1.asignarResponsabilidades("Revisar currículums", "Patricia");
        gerente1.darAscenso("Juan Martínez");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("6. Gerente con más responsabilidades:");
        gerente2.hacerReunion();
        gerente2.aprobarPresupuesto(15000.0);
        gerente2.asignarResponsabilidades("Desarrollar API", "Dev Team");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("7. Comparando bonos (el gerente recibe más):");
        System.out.println("Bono empleado regular: $" + String.format("%.2f", empleado1.calcularBono()));
        System.out.println("Bono gerente sin empleados a cargo: $" + 
                         String.format("%.2f", gerente1.calcularBono()));
        System.out.println("Bono gerente con 8 empleados a cargo: $" + 
                         String.format("%.2f", gerente2.calcularBono()));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Demostrando polimorfismo
        System.out.println("8. Demostrando Polimorfismo:");
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new Empleado("Juan Rodríguez", 2300.0);
        empleados[1] = new Empleado("María Sánchez", 2400.0);
        empleados[2] = new Gerente("Carlos Ruiz", 4800.0, "Ventas", 5);
        empleados[3] = new Gerente("Elena Morales", 5500.0, "Marketing", 6);
        
        System.out.println("\nMostrando detalles de todos:");
        for (int i = 0; i < empleados.length; i++) {
            empleados[i].mostrarDetalles();
            System.out.println("Bono: $" + String.format("%.2f", empleados[i].calcularBono()));
            System.out.println();
        }
        
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("9. Operaciones de empleados:");
        for (Empleado emp : empleados) {
            emp.registrarAsistencia();
            emp.trabajar();
            System.out.println();
        }
        
        System.out.println("=".repeat(50));
    }
}
