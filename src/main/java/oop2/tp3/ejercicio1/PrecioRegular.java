package oop2.tp3.ejercicio1;

public class PrecioRegular implements Precio {
    @Override
    public double calcularMonto(int dias) {
        double monto = 2;
        if (dias > 2) {
            monto += (dias - 2) * 1.5;
        }
        return monto;
    }

    @Override
    public int calcularPuntos(int dias) {
        return 1;
    }
}