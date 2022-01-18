package org.acme.CSV;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class EscritorCSV {
    public static void main(String[] args) {
        try {

            //We have to create the CSVPrinter class object
            Writer writer = Files.newBufferedWriter(Paths.get("bebidaTest.csv"));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            //Writing records in the generated CSV file
            csvPrinter.printRecord(6, "Picolino", "Refrigerante");
            csvPrinter.printRecord(7, "Fanta-Uva", "Refrigerante");
            csvPrinter.printRecord(8, "Soda", "Refrigerante");

            //Writing records in the form of a list
            //csvPrinter.printRecord(Arrays.asList("Dev Bhatia", 4000));

            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}