package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {

    private static final String ARCHIVO_CSV = "src/main/resources/data.csv";
    private static final String COMPANY_NAME = "company_name";
    private static final String CITY = "city";
    private static final String STATE = "state";
    private static final String ROUND = "round";
    private static final String PERMALINK = "permalink";
    private static final String NUMBER_EMPLOYEES = "number_employees";
    private static final String CATEGORY = "category";
    private static final String FUNDED_DATE = "funded_date";
    private static final String RAISED_AMOUNT = "raised_amount";
    private static final String RAISED_CURRENCY = "raised_currency";

    private static final int INDICE_PERMALINK = 0;
    private static final int INDICE_COMPANY_NAME = 1;
    private static final int INDICE_NUMBER_EMPLOYEES = 2;
    private static final int INDICE_CATEGORY = 3;
    private static final int INDICE_CITY = 4;
    private static final int INDICE_STATE = 5;
    private static final int INDICE_FUNDED_DATE = 6;
    private static final int INDICE_RAISED_AMOUNT = 7;
    private static final int INDICE_RAISED_CURRENCY = 8;
    private static final int INDICE_ROUND = 9;

    private List<String[]> csvData;

    public Recaudacion(FuenteDeDatos Datos) {
        this.csvData = Datos.toList();
    }

    public List<Map<String, String>> where(Map<String, String> options) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(ARCHIVO_CSV));
        this.csvData = new ArrayList<>();
        String[] fila;

        while ((fila = reader.readNext()) != null) {
            csvData.add(fila);
        }

        reader.close();
        csvData.remove(0);

        filtrarPor(options, COMPANY_NAME, INDICE_COMPANY_NAME);
        filtrarPor(options, CITY, INDICE_CITY);
        filtrarPor(options, STATE, INDICE_STATE);
        filtrarPor(options, ROUND, INDICE_ROUND);

        return crearResultado();
    }

    private void filtrarPor(Map<String, String> opciones, String columna, int indiceColumna) {
        if (opciones.containsKey(columna)) {
            List<String[]> resultados = new ArrayList<>();
            for (String[] fila : csvData) {
                if (fila[indiceColumna].equals(opciones.get(columna))) {
                    resultados.add(fila);
                }
            }
            this.csvData = resultados;
        }
    }

    private List<Map<String, String>> crearResultado() {
        List<Map<String, String>> salida = new ArrayList<>();

        for (String[] filaActual : csvData) {
            Map<String, String> mapeo = new HashMap<>();
            mapeo.put(PERMALINK, filaActual[INDICE_PERMALINK]);
            mapeo.put(COMPANY_NAME, filaActual[INDICE_COMPANY_NAME]);
            mapeo.put(NUMBER_EMPLOYEES, filaActual[INDICE_NUMBER_EMPLOYEES]);
            mapeo.put(CATEGORY, filaActual[INDICE_CATEGORY]);
            mapeo.put(CITY, filaActual[INDICE_CITY]);
            mapeo.put(STATE, filaActual[INDICE_STATE]);
            mapeo.put(FUNDED_DATE, filaActual[INDICE_FUNDED_DATE]);
            mapeo.put(RAISED_AMOUNT, filaActual[INDICE_RAISED_AMOUNT]);
            mapeo.put(RAISED_CURRENCY, filaActual[INDICE_RAISED_CURRENCY]);
            mapeo.put(ROUND, filaActual[INDICE_ROUND]);
            salida.add(mapeo);
        }

        return salida;
    }
}
