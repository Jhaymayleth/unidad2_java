package ejercicio4;
/**
 * INCORRECTO: Intento de heredar de dos clases
 *ESTO NO COMPILA - GENERA ERROR DE COMPILACIÓN
 */
public class ClaseC extends ClaseA, ClaseB {  // ERROR
    
    public void metodoC() {
        System.out.println("Método de Clase C");
    }
}