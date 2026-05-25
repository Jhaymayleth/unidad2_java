package Taller7.ejercicio_2;

/**
 * Clase que representa una cuenta bancaria
 * Demuestra el uso correcto de modificadores public y private
 * para proteger datos sensibles
 */
public class CuentaBancaria {
    
    // ✅ PRIVADO: Datos sensibles protegidos
    // numeroCuenta es de solo lectura (sin setter)
    private String numeroCuenta;
    
    // ✅ PRIVADO: Saldo protegido con getter y setter
    private double saldo;
    
    // ✅ PÚBLICO: Tipo de cuenta (información no sensible)
    public String tipoCuenta;
    
    // Otros atributos privados útiles
    private int transacciones;
    
    /**
     * Constructor público de CuentaBancaria
     * @param numeroCuenta Número único de la cuenta
     * @param saldoInicial Saldo inicial de la cuenta
     * @param tipoCuenta Tipo de cuenta (Ahorros, Corriente, etc.)
     */
    public CuentaBancaria(String numeroCuenta, double saldoInicial, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        // Validar saldo inicial
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("⚠️ Saldo inicial inválido. Se estableció en 0.");
        }
        this.tipoCuenta = tipoCuenta;
        this.transacciones = 0;
    }
    
    /**
     * Getter público para numeroCuenta (solo lectura)
     * ✅ El número de cuenta NO puede modificarse
     * @return El número de cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    /**
     * Getter público para obtener el saldo
     * @return El saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Setter público para establecer el saldo
     * ✅ Incluye validación: el saldo debe ser >= 0
     * @param nuevoSaldo El nuevo saldo
     */
    public void setSaldo(double nuevoSaldo) {
        if (nuevoSaldo >= 0) {
            this.saldo = nuevoSaldo;
            System.out.println("✅ Saldo actualizado: $" + String.format("%.2f", nuevoSaldo));
        } else {
            System.out.println("❌ Error: El saldo no puede ser negativo.");
        }
    }
    
    /**
     * Método público para realizar un depósito
     * @param cantidad La cantidad a depositar
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            transacciones++;
            System.out.println("✅ Depósito realizado: $" + String.format("%.2f", cantidad));
            System.out.println("   Saldo actual: $" + String.format("%.2f", saldo));
        } else {
            System.out.println("❌ Error: La cantidad debe ser mayor a 0.");
        }
    }
    
    /**
     * Método público para realizar un retiro
     * @param cantidad La cantidad a retirar
     */
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            transacciones++;
            System.out.println("✅ Retiro realizado: $" + String.format("%.2f", cantidad));
            System.out.println("   Saldo actual: $" + String.format("%.2f", saldo));
        } else if (cantidad > saldo) {
            System.out.println("❌ Error: Fondos insuficientes. Saldo: $" + 
                             String.format("%.2f", saldo));
        } else {
            System.out.println("❌ Error: La cantidad debe ser mayor a 0.");
        }
    }
    
    /**
     * Método público para transferir dinero a otra cuenta
     * @param otraCuenta La cuenta receptora
     * @param cantidad La cantidad a transferir
     */
    public void transferir(CuentaBancaria otraCuenta, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            this.retirar(cantidad);
            otraCuenta.depositar(cantidad);
            System.out.println("✅ Transferencia completada de " + this.numeroCuenta + 
                             " a " + otraCuenta.numeroCuenta);
        } else {
            System.out.println("❌ Error: Transferencia no válida.");
        }
    }
    
    /**
     * Método público para mostrar los detalles de la cuenta
     */
    public void mostrarDetalles() {
        System.out.println("\n--- Detalles de la Cuenta Bancaria ---");
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + String.format("%.2f", saldo));
        System.out.println("Total de Transacciones: " + transacciones);
    }
    
    /**
     * Método público para obtener el número de transacciones
     * @return El número de transacciones realizadas
     */
    public int getTransacciones() {
        return transacciones;
    }
}