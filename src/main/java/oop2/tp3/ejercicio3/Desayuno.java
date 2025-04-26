package oop2.tp3.ejercicio3;

public class Desayuno extends Gasto {
    public Desayuno(int monto) {
        super(monto);
    }

    @Override
    public String nombre() {
        return "Desayuno";
    }

    @Override
    public boolean esExcesoDeComida() {
        return monto > 1000;
    }

    @Override
    public int montoComida() {
        return monto;
    }
}
