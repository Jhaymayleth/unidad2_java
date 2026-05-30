package Taller12.Ejercicio3;

public class Piedra implements Volador {
    private String nombre;
    
    public Piedra(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void volar() {
        System.out.println("La piedra " + nombre + " no puede volar.");
    }
}
