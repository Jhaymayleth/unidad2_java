package Taller7.ejercicio_3;

/**
 * Clase de prueba para Ejercicio 3: Clase Utilidades
 * Demuestra el uso de métodos públicos estáticos
 * para realizar operaciones matemáticas
 */
public class PruebaEjercicio3 {
    
    public static void main(String[] args) {
        System.out.println("========== EJERCICIO 3: CLASE UTILIDADES ==========\n");
        
        // ============ OPERACIONES BÁSICAS ============
        System.out.println("1. Operaciones Matemáticas Básicas:");
        System.out.println("=".repeat(50) + "\n");
        
        double a = 20.0;
        double b = 5.0;
        
        System.out.println("Operandos: a = " + a + ", b = " + b + "\n");
        
        System.out.println("Suma: " + a + " + " + b + " = " + 
                         String.format("%.2f", Utilidades.suma(a, b)));
        
        System.out.println("Resta: " + a + " - " + b + " = " + 
                         String.format("%.2f", Utilidades.resta(a, b)));
        
        System.out.println("Multiplicación: " + a + " × " + b + " = " + 
                         String.format("%.2f", Utilidades.multiplicar(a, b)));
        
        System.out.println("División: " + a + " ÷ " + b + " = " + 
                         String.format("%.2f", Utilidades.dividir(a, b)));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ OPERACIONES AVANZADAS ============
        System.out.println("2. Operaciones Matemáticas Avanzadas:");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Potencia: 2^5 = " + 
                         String.format("%.2f", Utilidades.potencia(2, 5)));
        
        System.out.println("Raíz Cuadrada: √16 = " + 
                         String.format("%.2f", Utilidades.raizCuadrada(16)));
        
        System.out.println("Raíz Cuadrada: √2 = " + 
                         String.format("%.4f", Utilidades.raizCuadrada(2)));
        
        System.out.println("Valor Absoluto: |-15| = " + 
                         String.format("%.2f", Utilidades.valorAbsoluto(-15)));
        
        System.out.println("Máximo entre 10 y 25: " + 
                         String.format("%.2f", Utilidades.maximo(10, 25)));
        
        System.out.println("Mínimo entre 10 y 25: " + 
                         String.format("%.2f", Utilidades.minimo(10, 25)));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ VALIDACIÓN: DIVISIÓN POR CERO ============
        System.out.println("3. Validación: División por Cero:");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Intentando: 10 ÷ 0");
        double resultado = Utilidades.dividir(10, 0);
        System.out.println("Resultado: " + resultado);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ VALIDACIÓN: RAÍZ DE NEGATIVO ============
        System.out.println("4. Validación: Raíz de Número Negativo:");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Intentando: √(-9)");
        double resultadoRaiz = Utilidades.raizCuadrada(-9);
        System.out.println("Resultado: " + resultadoRaiz);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ REDONDEO ============
        System.out.println("5. Redondeo de Decimales:");
        System.out.println("=".repeat(50) + "\n");
        
        double numero = 3.14159265359;
        
        System.out.println("Número original: " + numero);
        System.out.println("Redondeado a 2 decimales: " + 
                         Utilidades.redondear(numero, 2));
        System.out.println("Redondeado a 4 decimales: " + 
                         Utilidades.redondear(numero, 4));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ PROMEDIO ============
        System.out.println("6. Cálculo de Promedio:");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Promedio de (10, 20, 30): " + 
                         String.format("%.2f", Utilidades.promedio(10, 20, 30)));
        
        System.out.println("Promedio de (85.5, 90, 78, 92.5): " + 
                         String.format("%.2f", Utilidades.promedio(85.5, 90, 78, 92.5)));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ NÚMEROS PARES E IMPARES ============
        System.out.println("7. Verificación de Paridad:");
        System.out.println("=".repeat(50) + "\n");
        
        int[] numeros = {2, 5, 10, 15, 20, 33};
        
        for (int num : numeros) {
            String paridad = Utilidades.esPar(num) ? "Par" : "Impar";
            System.out.println(num + " es: " + paridad);
        }
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ NÚMEROS PRIMOS ============
        System.out.println("8. Verificación de Números Primos:");
        System.out.println("=".repeat(50) + "\n");
        
        int[] candidatos = {2, 3, 4, 5, 10, 11, 17, 20, 23};
        
        for (int num : candidatos) {
            String es = Utilidades.esPrimo(num) ? "Es primo" : "No es primo";
            System.out.println(num + ": " + es);
        }
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ FACTORIAL ============
        System.out.println("9. Cálculo de Factorial:");
        System.out.println("=".repeat(50) + "\n");
        
        int[] factoriales = {0, 1, 5, 10};
        
        for (int num : factoriales) {
            System.out.println(num + "! = " + Utilidades.factorial(num));
        }
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ CASO DE USO REAL ============
        System.out.println("10. Caso de Uso Real: Cálculo de Área de un Círculo:");
        System.out.println("=".repeat(50) + "\n");
        
        double radio = 5.0;
        double area = Utilidades.multiplicar(
                        Utilidades.potencia(radio, 2),
                        Math.PI
                      );
        
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + String.format("%.2f", area) + " unidades²");
        System.out.println("Fórmula usada: π × r² = " + 
                         String.format("%.4f", Math.PI) + " × " + 
                         String.format("%.2f", Utilidades.potencia(radio, 2)) + 
                         " = " + String.format("%.2f", area));
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // ============ CASO DE USO: CÁLCULOS FINANCIEROS ============
        System.out.println("11. Caso de Uso Real: Cálculos Financieros:");
        System.out.println("=".repeat(50) + "\n");
        
        double salario = 3000.0;
        double incremento = 10; // 10%
        double nuevoSalario = Utilidades.suma(
                                salario, 
                                Utilidades.multiplicar(salario, incremento / 100)
                              );
        
        System.out.println("Salario actual: $" + String.format("%.2f", salario));
        System.out.println("Incremento: " + incremento + "%");
        System.out.println("Nuevo salario: $" + String.format("%.2f", nuevoSalario));
        System.out.println("Aumento: $" + String.format("%.2f", Utilidades.resta(nuevoSalario, salario)));
        
        System.out.println("\n" + "=".repeat(50));
    }
}
