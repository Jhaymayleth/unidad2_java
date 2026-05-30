package Taller10;

class ProfesorT10 extends PersonaT10 {
    String especialidad;

    public ProfesorT10(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + nombre + " y mi especialidad es " + especialidad + ".");
    }
}

