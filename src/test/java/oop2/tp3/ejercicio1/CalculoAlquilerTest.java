package oop2.tp3.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculoAlquilerTest {
    private Cliente cliente;


    @Test
    public void testCalculoDeudaYPuntos() {
    	Libro elTunel = new Libro("El Túnel", new PrecioRegular());
    	Libro antesDelFin = new Libro("Antes del Fin", new PrecioRegular());
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

        cliente = new Cliente("Javier");
        cliente.alquilar(alquilerElTunel);
        cliente.alquilar(alquilerAntesDelFin);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(10.0, (double) resultado[0]);
        assertEquals(2, (int) resultado[1]);
    }
    @Test
    public void testCalculoDeudaYPuntos2() {
    	Libro elTunel = new Libro("El Túnel", new PrecioInfantil());
    	Libro antesDelFin = new Libro("Antes del Fin", new PrecioInfantil());
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

        cliente = new Cliente("Javier");
        cliente.alquilar(alquilerElTunel);
        cliente.alquilar(alquilerAntesDelFin);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(6.0, (double) resultado[0]);
        assertEquals(2, (int) resultado[1]);
    }
    
    @Test
    public void testCalculoDeudaYPuntos3() {
    	Libro elTunel = new Libro("El Túnel", new PrecioNuevoLanzamiento());
    	Libro antesDelFin = new Libro("Antes del Fin", new PrecioNuevoLanzamiento());
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

        cliente = new Cliente("Javier");
        cliente.alquilar(alquilerElTunel);
        cliente.alquilar(alquilerAntesDelFin);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(24.0, (double) resultado[0]);
        assertEquals(4, (int) resultado[1]);
    }
    @Test
    public void testCalculoDeudaYPuntos4() {
    	Libro elTunel = new Libro("El Túnel", new PrecioNuevoLanzamiento());
    	Libro antesDelFin = new Libro("Antes del Fin", new PrecioNuevoLanzamiento());
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 1);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 1);
        String resultadoS =elTunel.nombre();
        cliente = new Cliente("Javier");
        cliente.alquilar(alquilerElTunel);
        cliente.alquilar(alquilerAntesDelFin);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(6.0, (double) resultado[0]);
        assertEquals(2, (int) resultado[1]);
        assertEquals("El Túnel", resultadoS);
    }
}
