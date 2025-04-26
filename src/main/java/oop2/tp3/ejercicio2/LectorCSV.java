package oop2.tp3.ejercicio2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;

public class LectorCSV implements FuenteDeDatos {

    private final String csvPath;

    public LectorCSV(String csvPath) {
        this.csvPath = csvPath;
    }

    @Override
    public List<String[]> toList() {
        List<String[]> csvData = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(this.csvPath))) {
            String[] row;
            while ((row = reader.readNext()) != null) {
                csvData.add(row);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (!csvData.isEmpty()) {
            csvData.remove(0); 
        }

        return csvData;
    }
}
