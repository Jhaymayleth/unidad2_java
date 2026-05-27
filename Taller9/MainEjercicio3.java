package Taller9;

class ClaseBase {
    private String atributoPrivado = "Soy privado";
    protected String atributoProtegido = "Soy protegido";

    public String getAtributoPrivado() {
        return atributoPrivado;
    }
}

class ClaseDerivada extends ClaseBase {
    public void intentarAccederAtributoPrivado() {
        // super.atributoPrivado; // Esto causaría un error de compilación: atributoPrivado tiene acceso privado
        System.out.println("Intentando acceder a atributoPrivado de la clase base (incorrecto): No se puede acceder directamente.");
        System.out.println("Accediendo a atributoProtegido de la clase base (correcto): " + super.atributoProtegido);
        System.out.println("Accediendo a atributoPrivado a través de un getter (correcto): " + super.getAtributoPrivado());
    }
}

public class MainEjercicio3 {
    public static void main(String[] args) {
        // 1. Intentar utilizar super en un contexto que no sea una clase derivada
        // super.toString(); // Error de compilación: 'super' cannot be used in a static context
        System.out.println("Demostración de uso incorrecto de 'super' en un contexto no derivado (como main): No compila.");
        System.out.println("El error sería: 'super' cannot be used in a static context");

        ClaseDerivada objDerivado = new ClaseDerivada();
        objDerivado.intentarAccederAtributoPrivado();
    }
}