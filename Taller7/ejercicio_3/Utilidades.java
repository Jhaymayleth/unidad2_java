package Taller7.ejercicio_3;

/**
 * Clase Utilidades que proporciona métodos públicos estáticos
 * para realizar operaciones matemáticas básicas y avanzadas
 * 
 * Esta clase es un ejemplo de método de utilidad pública (Utility Class)
 * que agrupa funcionalidades que pueden ser usadas desde cualquier lugar
 */
public class Utilidades {
    
    // Constante pública para precisión decimal
    public static final double PRECISION = 1e-10;
    
    // Nota: No instanciamos Utilidades, solo usamos métodos estáticos
    private Utilidades() {
        // Evita que se cree instancia de esta clase
    }
    
    /**
     * Método público estático para sumar dos números
     * @param a Primer número
     * @param b Segundo número
     * @return La suma de a + b
     */
    public static double suma(double a, double b) {
        return a + b;
    }
    
    /**
     * Método público estático para restar dos números
     * @param a Minuendo
     * @param b Sustraendo
     * @return La resta de a - b
     */
    public static double resta(double a, double b) {
        return a - b;
    }
    
    /**
     * Método público estático para multiplicar dos números
     * @param a Primer factor
     * @param b Segundo factor
     * @return El producto de a * b
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    /**
     * Método público estático para dividir dos números
     * ✅ Incluye validación: no permite división por cero
     * @param dividendo El número a dividir
     * @param divisor El número que divide
     * @return El resultado de dividendo / divisor
     */
    public static double dividir(double dividendo, double divisor) {
        if (Math.abs(divisor) < PRECISION) {
            System.out.println("❌ Error: No se puede dividir por cero.");
            return 0;
        }
        return dividendo / divisor;
    }
    
    /**
     * Método público estático para calcular potencia
     * @param base La base
     * @param exponente El exponente
     * @return base elevado a la potencia exponente
     */
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
    /**
     * Método público estático para calcular raíz cuadrada
     * ✅ Incluye validación: no permite raíz de negativos
     * @param numero El número
     * @return La raíz cuadrada de número
     */
    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            System.out.println("❌ Error: No se puede calcular raíz de número negativo.");
            return -1;
        }
        return Math.sqrt(numero);
    }
    
    /**
     * Método público estático para calcular valor absoluto
     * @param numero El número
     * @return El valor absoluto de número
     */
    public static double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }
    
    /**
     * Método público estático para encontrar el máximo entre dos números
     * @param a Primer número
     * @param b Segundo número
     * @return El mayor de los dos números
     */
    public static double maximo(double a, double b) {
        return Math.max(a, b);
    }
    
    /**
     * Método público estático para encontrar el mínimo entre dos números
     * @param a Primer número
     * @param b Segundo número
     * @return El menor de los dos números
     */
    public static double minimo(double a, double b) {
        return Math.min(a, b);
    }
    
    /**
     * Método público estático para redondear un número
     * @param numero El número a redondear
     * @param decimales Número de decimales
     * @return El número redondeado
     */
    public static double redondear(double numero, int decimales) {
        double factor = Math.pow(10, decimales);
        return Math.round(numero * factor) / factor;
    }
    
    /**
     * Método público estático para calcular el promedio de números
     * @param numeros Variable cantidad de números
     * @return El promedio
     */
    public static double promedio(double... numeros) {
        if (numeros.length == 0) {
            return 0;
        }
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
    
    /**
     * Método público estático para verificar si un número es par
     * @param numero El número
     * @return true si es par, false si es impar
     */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    
    /**
     * Método público estático para verificar si un número es primo
     * @param numero El número
     * @return true si es primo, false si no lo es
     */
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Método público estático para calcular factorial
     * @param numero El número
     * @return El factorial de número
     */
    public static long factorial(int numero) {
        if (numero < 0) {
            System.out.println("❌ Error: No se puede calcular factorial de negativo.");
            return -1;
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
