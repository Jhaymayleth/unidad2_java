package Taller12.Ejercicio2;

public class Pez implements Nadador, Respirador {
    private String nombre;
    private String tipo;
    
    public Pez(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    @Override
    public void nadar() {
        System.out.println("El pez " + nombre + " (" + tipo + ") está nadando en el agua.");
    }
    
    @Override
    public void respirar() {
        System.out.println("El pez " + nombre + " está respirando a través de sus branquias.");
    }
}
