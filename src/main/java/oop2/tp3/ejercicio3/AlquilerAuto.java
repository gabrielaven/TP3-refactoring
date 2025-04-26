package oop2.tp3.ejercicio3;

public class AlquilerAuto extends Gasto {
    public AlquilerAuto(int monto) {
        super(monto);
    }

    @Override
    public String nombre() {
        return "Alquiler de Autos";
    }

    @Override
    public boolean esExcesoDeComida() {
        return false;
    }
}
