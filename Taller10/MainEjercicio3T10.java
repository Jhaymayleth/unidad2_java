package Taller10;

class ClaseBaseT10 {
    public void metodoSobrescrito() {
        System.out.println("Método sobrescrito de ClaseBaseT10.");
    }

    public void metodoConParametro(String mensaje) {
        System.out.println("Método con parámetro de ClaseBaseT10: " + mensaje);
    }
}

class ClaseDerivadaT10 extends ClaseBaseT10 {
    // 1. Intento de sobrescribir cambiando la firma (esto es sobrecarga, no sobrescritura)
    // Si se intenta usar @Override aquí, daría error de compilación.
    public void metodoSobrescrito(int numero) {
        System.out.println("Método sobrecargado de ClaseDerivadaT10 con número: " + numero);
    }

    // 2. Sobrescritura correcta pero sin la anotación @Override (mala práctica)
    public void metodoSobrescrito() {
        System.out.println("Método sobrescrito de ClaseDerivadaT10 (sin @Override).");
    }

    // Demostración de error si se intenta sobrescribir con firma diferente y @Override
    /*
    @Override
    public void metodoConParametro() { // Error: la firma no coincide con el método de la superclase
        System.out.println("Esto daría un error de compilación si se descomenta.");
    }
    */
}

public class MainEjercicio3T10 {
    public static void main(String[] args) {
        System.out.println("\n--- Demostración de Uso Incorrecto de Sobrescritura (Ejercicio 3) ---");

        ClaseBaseT10 base = new ClaseBaseT10();
        ClaseDerivadaT10 derivada = new ClaseDerivadaT10();

        System.out.println("\n--- Caso 1: Sobrecarga vs Sobrescritura (cambio de firma) ---");
        base.metodoSobrescrito(); // Llama al método de la clase base
        derivada.metodoSobrescrito(); // Llama al método sobrescrito (sin @Override)
        derivada.metodoSobrescrito(10); // Llama al método sobrecargado
        System.out.println("Explicación: El método con 'int numero' en ClaseDerivadaT10 es una sobrecarga, no una sobrescritura, porque su firma es diferente. Si se hubiera usado @Override, habría un error de compilación.");

        System.out.println("\n--- Caso 2: Sobrescritura sin @Override ---");
        System.out.println("Explicación: El método 'metodoSobrescrito()' en ClaseDerivadaT10 sobrescribe correctamente el de la clase base, pero la ausencia de @Override significa que el compilador no verificará si realmente estás sobrescribiendo un método existente. Esto puede llevar a errores difíciles de detectar si la firma del método en la clase base cambia en el futuro.");

        System.out.println("\n--- Caso 3: Intento de sobrescribir con firma diferente y @Override (comentado) ---");
        System.out.println("Si se descomentara el bloque de código con '@Override public void metodoConParametro()', el compilador generaría un error indicando que no hay un método con esa firma en la superclase para sobrescribir.");
    }
}
