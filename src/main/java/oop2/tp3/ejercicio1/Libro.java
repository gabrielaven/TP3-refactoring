package oop2.tp3.ejercicio1;

public class Libro {
    private String nombre;
    private Precio precio;

    public Libro(String nombre, Precio precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularMonto(int diasAlquilados) {
        return precio.calcularMonto(diasAlquilados);
    }

    public int calcularPuntos(int diasAlquilados) {
        return precio.calcularPuntos(diasAlquilados);
    }
    public String nombre() {
        return nombre;
    }
}