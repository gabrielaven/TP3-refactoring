package oop2.tp3.ejercicio1;

public class PrecioNuevoLanzamiento implements Precio{
    @Override
    public double calcularMonto(int dias) {
        return dias * 3;
    }

    @Override
    public int calcularPuntos(int dias) {
        return (dias > 1) ? 2 : 1;
    }
}