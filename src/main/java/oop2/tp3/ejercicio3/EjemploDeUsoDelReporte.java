package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class EjemploDeUsoDelReporte {
    public static void main(String[] args) {
        Gasto desayuno = new Desayuno(1200);
        Gasto cena = new Cena(6000);
        Gasto alquiler = new AlquilerAuto(3000);

        ReporteDeGastos reporte = new ReporteDeGastos(LocalDate.of(2025, 4, 11));
        String resultado = reporte.imprimir(List.of(desayuno, cena, alquiler));

        System.out.println(resultado);
    }
}
