package org.acme.CSV;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class LeitorCSV {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get("bebidatest.csv"));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("id", "nome", "tipo").withIgnoreHeaderCase().withTrim());

        for (CSVRecord csvRecord: csvParser) {

            String id = csvRecord.get(0);

            // Accessing Values by Column Index
            String nome = csvRecord.get(1);

            //Accessing the values by column header name
            String tipo = csvRecord.get(2);

            //Printing the record
            //System.out.println("Record Number - " + csvRecord.getRecordNumber());
            System.out.println(id + "," + nome + "," + tipo);
            //System.out.println("nome : " + nome);
            //System.out.println("tipo : " + tipo);
            //System.out.println("\n\n");
        }
    }
}