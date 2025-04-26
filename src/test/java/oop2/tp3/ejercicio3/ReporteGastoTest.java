package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteGastoTest {

    @Test
    public void testReporte() {
        Gasto desayuno = new Desayuno(1200); 
        Gasto cena = new Cena(6000);
        Gasto alquiler = new AlquilerAuto(3000); 

        LocalDate fecha = LocalDate.of(2025, 4, 11);
        ReporteDeGastos reporte = new ReporteDeGastos(fecha);
        String resultado = reporte.imprimir(List.of(desayuno, cena, alquiler));
        String esperado =
                "Expenses 2025-04-11" + System.lineSeparator() +
                "Desayuno\t1200\tX" + System.lineSeparator() +
                "Cena\t6000\tX" + System.lineSeparator() +
                "Alquiler de Autos\t3000\t" + System.lineSeparator() +
                "Gastos de comida: 7200" + System.lineSeparator() +
                "Total de gastos: 10200";

        assertEquals(esperado, resultado);
    }
}
