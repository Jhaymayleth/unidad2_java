package ejercicio4;

/**
 * CORRECTO: Usar interfaces en lugar de herencia múltiple
 * ESTO SÍ COMPILA
 */
public class ClaseC_CORRECTO extends ClaseA implements InterfazB {
    
    @Override
    public void metodoB() {
        System.out.println("Método de Clase B implementado en C");
    }
    
    public void metodoC() {
        System.out.println("Método de Clase C");
    }
}