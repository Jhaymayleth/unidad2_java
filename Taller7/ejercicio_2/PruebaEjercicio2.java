package Taller7.ejercicio_2;

/**
 * Clase de prueba para Ejercicio 2: Clase CuentaBancaria
 * Demuestra el acceso a miembros públicos y privados
 * Intenta acceder a numeroCuenta (causará error)
 */
public class PruebaEjercicio2 {
    
    public static void main(String[] args) {
        System.out.println("========== EJERCICIO 2: CLASE CUENTABANCARIA ==========\n");
        
        // ============ CREANDO CUENTAS BANCARIAS ============
        System.out.println("1. Creando cuentas bancarias:");
        System.out.println("=".repeat(50) + "\n");
        
        CuentaBancaria cuenta1 = new CuentaBancaria("001-2024-12345", 5000.0, "Ahorros");
        CuentaBancaria cuenta2 = new CuentaBancaria("001-2024-67890", 3000.0, "Corriente");
        
        System.out.println("✅ Cuenta 1 creada");
        System.out.println("✅ Cuenta 2 creada");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ ACCEDIENDO A ATRIBUTO PÚBLICO ============
        System.out.println("2. Accediendo al atributo PÚBLICO 'tipoCuenta':");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Tipo de Cuenta 1: " + cuenta1.tipoCuenta);
        System.out.println("Tipo de Cuenta 2: " + cuenta2.tipoCuenta);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ MODIFICANDO ATRIBUTO PÚBLICO ============
        System.out.println("3. Modificando el atributo PÚBLICO 'tipoCuenta':");
        System.out.println("=".repeat(50) + "\n");
        
        cuenta1.tipoCuenta = "Ahorros Premium";
        System.out.println("Tipo de Cuenta 1 actualizado: " + cuenta1.tipoCuenta);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ USANDO GETTER PARA NÚMERO DE CUENTA ============
        System.out.println("4. Usando getter para acceder al número de cuenta PRIVADO:");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Número de Cuenta 1: " + cuenta1.getNumeroCuenta());
        System.out.println("Número de Cuenta 2: " + cuenta2.getNumeroCuenta());
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ INTENTANDO ACCEDER A PRIVADOS (COMENTADO) ============
        System.out.println("5. Intentando acceder DIRECTAMENTE a atributo PRIVADO:");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Código que causaría ERROR:");
        System.out.println("  String numero = cuenta1.numeroCuenta; // ❌ ERROR");
        System.out.println("\n❌ ERROR DE COMPILACIÓN:");
        System.out.println("   numeroCuenta has private access in CuentaBancaria\n");
        
        System.out.println("Código que causaría ERROR:");
        System.out.println("  double s = cuenta1.saldo; // ❌ ERROR");
        System.out.println("\n❌ ERROR DE COMPILACIÓN:");
        System.out.println("   saldo has private access in CuentaBancaria\n");
        
        System.out.println("=".repeat(50) + "\n");
        
        // ============ USANDO GETTER PARA SALDO ============
        System.out.println("6. Usando getter para acceder al saldo PRIVADO:");
        System.out.println("=".repeat(50) + "\n");
        
        double saldo1 = cuenta1.getSaldo();
        double saldo2 = cuenta2.getSaldo();
        
        System.out.println("Saldo de Cuenta 1: $" + String.format("%.2f", saldo1));
        System.out.println("Saldo de Cuenta 2: $" + String.format("%.2f", saldo2));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ USANDO SETTER PARA SALDO ============
        System.out.println("7. Usando setter para actualizar el saldo:");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Estableciendo saldo válido (6000):");
        cuenta1.setSaldo(6000.0);
        
        System.out.println("\nIntentando establecer saldo negativo (-1000):");
        cuenta1.setSaldo(-1000.0);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ OPERACIONES BANCARIAS ============
        System.out.println("8. Realizando operaciones bancarias:");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Depósito en Cuenta 1:");
        cuenta1.depositar(1500.0);
        
        System.out.println("\nRetiro en Cuenta 1:");
        cuenta1.retirar(2000.0);
        
        System.out.println("\nIntentando retirar más de lo disponible:");
        cuenta1.retirar(10000.0);
        
        System.out.println("\nDepósito en Cuenta 2:");
        cuenta2.depositar(500.0);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ MOSTRANDO DETALLES ============
        System.out.println("9. Mostrando detalles de las cuentas:");
        System.out.println("=".repeat(50));
        
        cuenta1.mostrarDetalles();
        cuenta2.mostrarDetalles();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ TRANSFERENCIAS ============
        System.out.println("10. Realizando transferencia de cuenta a cuenta:");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Transferencia de Cuenta 1 a Cuenta 2 (1000):");
        cuenta1.transferir(cuenta2, 1000.0);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ DETALLES FINALES ============
        System.out.println("11. Estado final de las cuentas:");
        System.out.println("=".repeat(50));
        
        cuenta1.mostrarDetalles();
        cuenta2.mostrarDetalles();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ COMPARACIÓN DE ACCESO ============
        System.out.println("12. Resumen: Acceso a miembros");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("MIEMBRO PÚBLICO (tipoCuenta):");
        System.out.println("  ✅ Acceso directo: cuenta1.tipoCuenta");
        System.out.println("  ✅ Modificación directa: cuenta1.tipoCuenta = \"...\"");
        System.out.println("  ⚠️ Riesgo: Sin validación\n");
        
        System.out.println("MIEMBRO PRIVADO (numeroCuenta):");
        System.out.println("  ❌ Acceso directo: NO PERMITIDO");
        System.out.println("  ✅ Getter: cuenta1.getNumeroCuenta()");
        System.out.println("  ✅ Setter: NO EXISTE (solo lectura)");
        System.out.println("  ✅ Seguridad: Protegido de cambios\n");
        
        System.out.println("MIEMBRO PRIVADO (saldo):");
        System.out.println("  ❌ Acceso directo: NO PERMITIDO");
        System.out.println("  ✅ Getter: cuenta1.getSaldo()");
        System.out.println("  ✅ Setter con validación: cuenta1.setSaldo(...)");
        System.out.println("  ✅ Seguridad: Validado y controlado");
        
        System.out.println("\n" + "=".repeat(50));
    }
}
