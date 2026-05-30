package Taller9;

public class Pez extends Animal {
    String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // Llama al constructor de la clase base Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // Llama al método mostrarEspecie de la clase base Animal
        System.out.println("Tipo de Agua: " + tipoDeAgua);
    }
}
