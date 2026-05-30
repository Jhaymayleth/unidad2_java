package Taller7.ejercicio_2;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;
    private int transacciones;

    public CuentaBancaria(String numeroCuenta, double saldoInicial, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("⚠️ Saldo inicial inválido. Se estableció en 0.");
        }

        this.tipoCuenta = tipoCuenta;
        this.transacciones = 0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double nuevoSaldo) {
        if (nuevoSaldo >= 0) {
            this.saldo = nuevoSaldo;
            System.out.println("✅ Saldo actualizado: $" + String.format("%.2f", nuevoSaldo));
        } else {
            System.out.println("❌ Error: El saldo no puede ser negativo.");
        }
    }

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

    public void mostrarDetalles() {
        System.out.println("\n--- Detalles de la Cuenta Bancaria ---");
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + String.format("%.2f", saldo));
        System.out.println("Total de Transacciones: " + transacciones);
    }

    public int getTransacciones() {
        return transacciones;
    }
}