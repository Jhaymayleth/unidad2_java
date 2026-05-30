package Taller7.ejercicio_3;

public class Utilidades {

    public static final double PRECISION = 1e-10;

    private Utilidades() {
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double dividendo, double divisor) {
        if (Math.abs(divisor) < PRECISION) {
            System.out.println("❌ Error: No se puede dividir por cero.");
            return 0;
        }
        return dividendo / divisor;
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            System.out.println("❌ Error: No se puede calcular raíz de número negativo.");
            return -1;
        }
        return Math.sqrt(numero);
    }

    public static double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }

    public static double maximo(double a, double b) {
        return Math.max(a, b);
    }

    public static double minimo(double a, double b) {
        return Math.min(a, b);
    }

    public static double redondear(double numero, int decimales) {
        double factor = Math.pow(10, decimales);
        return Math.round(numero * factor) / factor;
    }

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

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

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