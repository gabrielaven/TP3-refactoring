package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {
    private final LocalDate fecha;

    public ReporteDeGastos(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String imprimir(List<Gasto> gastos) {
        int total = 0;
        int gastosDeComida = 0;
        String resultado = "Expenses " + fecha + System.lineSeparator();

        for (Gasto gasto : gastos) {
            String nombreGasto = gasto.nombre();
            String marcaExceso = gasto.esExcesoDeComida() ? "X" : "";

            resultado += nombreGasto + "\t" + gasto.monto() + "\t" + marcaExceso + System.lineSeparator();

            total += gasto.monto();
            gastosDeComida += gasto.montoComida();
        }

        resultado += "Gastos de comida: " + gastosDeComida + System.lineSeparator();
        resultado += "Total de gastos: " + total;

        return resultado;
    }
}
