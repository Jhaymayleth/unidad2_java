package Taller11;

abstract class ClaseAbstractaIncorrecta {
    protected String mensaje;

    public ClaseAbstractaIncorrecta(String mensaje) {
        this.mensaje = mensaje;
    }

    public abstract void metodoAbstracto();

    // Este es un método concreto en una clase abstracta.
    // Podría ser una mala práctica si se espera que las subclases siempre lo modifiquen
    // pero no se declara abstracto.
    public void metodoConcretoQuePodriaSobreescribirse() {
        System.out.println("ClaseAbstractaIncorrecta: Este es un método concreto que hace algo por defecto: " + mensaje);
    }
}

class ImplementacionCorrecta extends ClaseAbstractaIncorrecta {
    public ImplementacionCorrecta(String mensaje) {
        super(mensaje);
    }

    @Override
    public void metodoAbstracto() {
        System.out.println("ImplementacionCorrecta: Implementación del método abstracto. Mensaje: " + mensaje);
    }

    // Sobrescribimos el método concreto para darle un comportamiento específico
    @Override
    public void metodoConcretoQuePodriaSobreescribirse() {
        System.out.println("ImplementacionCorrecta: Sobrescribiendo el método concreto. Mensaje: " + mensaje + " (comportamiento específico).");
    }
}

class ImplementacionOlvidadiza extends ClaseAbstractaIncorrecta {
    public ImplementacionOlvidadiza(String mensaje) {
        super(mensaje);
    }

    @Override
    public void metodoAbstracto() {
        System.out.println("ImplementacionOlvidadiza: Implementación del método abstracto. Mensaje: " + mensaje);
    }
    // Aquí se "olvida" sobrescribir metodoConcretoQuePodriaSobreescribirse()
    // y se hereda el comportamiento por defecto de la clase abstracta, lo cual
    // podría no ser lo deseado.
}

public class MainEjercicio3 {
    public static void main(String[] args) {
        System.out.println("\n--- Demostración de Uso Incorrecto de Clases Abstractas (Ejercicio 3) ---");

        // 1. Intentar instanciar una clase abstracta directamente
        // ClaseAbstractaIncorrecta objAbstracto = new ClaseAbstractaIncorrecta("Mensaje"); // ERROR DE COMPILACIÓN
        System.out.println("1. Intentar instanciar una clase abstracta directamente: \n   // ClaseAbstractaIncorrecta objAbstracto = new ClaseAbstractaIncorrecta(\"Mensaje\");\n   // Esto generaría un error de compilación: \"ClaseAbstractaIncorrecta is abstract; cannot be instantiated\"");

        System.out.println("\n2. Demostración de método concreto en clase abstracta (posible mala práctica):\n");

        ImplementacionCorrecta correcta = new ImplementacionCorrecta("Implementación Correcta");
        correcta.metodoAbstracto();
        correcta.metodoConcretoQuePodriaSobreescribirse();

        System.out.println("\n");

        ImplementacionOlvidadiza olvidadiza = new ImplementacionOlvidadiza("Implementación Olvidadiza");
        olvidadiza.metodoAbstracto();
        olvidadiza.metodoConcretoQuePodriaSobreescribirse(); // Usa el método de la clase abstracta

        System.out.println("\nExplicación del punto 2:\n   - ImplementacionCorrecta sobrescribe el método concreto, lo cual es ideal si se necesita un comportamiento específico.\n   - ImplementacionOlvidadiza no sobrescribe el método concreto, por lo que hereda el comportamiento por defecto de la clase abstracta. Esto puede ser un error si se esperaba una implementación específica y se olvidó sobrescribir. Si el método siempre debe ser implementado por las subclases, debería haber sido declarado como abstracto en la clase base.");
    }
}
