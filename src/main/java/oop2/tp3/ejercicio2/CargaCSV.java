package oop2.tp3.ejercicio2;


import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CargaCSV {

    private final String ruta;

    public CargaCSV(String ruta) {
        this.ruta = ruta;
    }

    public List<String[]> cargar() throws IOException {
        List<String[]> datos = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(ruta))) {
            String[] fila;
            while ((fila = reader.readNext()) != null) {
                datos.add(fila);
            }
        }

        return datos;
    }
}
