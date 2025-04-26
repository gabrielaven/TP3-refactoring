package oop2.tp3.ejercicio3;

public class Cena extends Gasto {
    public Cena(int monto) {
        super(monto);
    }

    @Override
    public String nombre() {
        return "Cena";
    }

    @Override
    public boolean esExcesoDeComida() {
        return monto > 5000;
    }

    @Override
    public int montoComida() {
        return monto;
    }
}
