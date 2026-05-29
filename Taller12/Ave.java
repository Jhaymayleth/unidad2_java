package Taller12;

public class Ave implements Volador, Cantante {
    private String nombre;
    private String especie;
    
    public Ave(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }
    
    @Override
    public void volar() {
        System.out.println("El ave " + nombre + " (" + especie + ") está volando.");
    }
    
    @Override
    public void cantar() {
        System.out.println("El ave " + nombre + " está cantando: ¡Pío pío!");
    }
}