package org.acme.CSV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class ImportCSV {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get("bebidaTest.csv"));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("id", "nome", "tipo").withIgnoreHeaderCase().withTrim());
        Writer writer = Files.newBufferedWriter(Paths.get("bebidaTest.sql"));

        for (CSVRecord csvRecord: csvParser) {

            String id = csvRecord.get(0);

            String nome = csvRecord.get(1);

            String tipo = csvRecord.get(2);

            String message = String.format("INSERT INTO bebidaSemAlcool (id, nome, tipo) VALUES('%s', '%s', '%s');", id, nome, tipo);

//            message = message.substring(1, message.length()-1);
//
//            System.out.println(message);

            try {

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

                csvPrinter.printRecord(message);
//                PrintWriter outFile = new PrintWriter("bebidaTest2.sql");
//                outFile.println(message);
                //outFile.println(message);
                //csvPrinter.printRecord(2, "Fanta", "Refrigerante");
                //csvPrinter.printRecord(3, "Guarana", "Refrigerante");

                csvPrinter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

    //INSERT INTO bebidaSemAlcool (id, nome, tipo) VALUES('1', 'Cola-Cola', 'Refrigerante');
