package Taller10;

class EstudianteT10 extends PersonaT10 {
    String carrera;

    public EstudianteT10(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y estudio " + carrera + ".");
    }
}