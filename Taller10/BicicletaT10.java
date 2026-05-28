package Taller10;

class BicicletaT10 extends VehiculoT10 {
    public BicicletaT10(String marca) {
        super(marca);
    }

    @Override
    public void moverse() {
        System.out.println("La bicicleta de marca " + marca + " se está moviendo pedaleando.");
    }
}