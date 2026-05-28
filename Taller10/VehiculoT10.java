package Taller10;

class VehiculoT10 {
    String marca;

    public VehiculoT10(String marca) {
        this.marca = marca;
    }

    public void moverse() {
        System.out.println("El vehículo de marca " + marca + " se está moviendo.");
    }
}