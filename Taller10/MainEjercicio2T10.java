package Taller10;

public class MainEjercicio2T10 {
    public static void main(String[] args) {
        VehiculoT10 vehiculo = new VehiculoT10("Toyota");
        BicicletaT10 bicicleta = new BicicletaT10("Specialized");

        System.out.println("\n--- Demostración de Sobrescritura (Ejercicio 2) ---");

        vehiculo.moverse();
        bicicleta.moverse();

        System.out.println("\n--- Polimorfismo ---");
        VehiculoT10 v1 = new BicicletaT10("Giant");
        v1.moverse(); // Llama al moverse de BicicletaT10
    }
}
