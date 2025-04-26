package oop2.tp3.ejercicio1;

public class PrecioInfantil implements Precio {
    @Override
    public double calcularMonto(int dias) {
        double monto = 1.5;
        if (dias > 3) {
            monto += (dias - 3) * 1.5;
        }
        return monto;
    }

    @Override
    public int calcularPuntos(int dias) {
        return 1;
    }
}