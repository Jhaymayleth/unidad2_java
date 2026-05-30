package ejercicio2;

public class Persona {

    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("--- Detalles de la Persona ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " acaba de cumplir " + edad + " años");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
