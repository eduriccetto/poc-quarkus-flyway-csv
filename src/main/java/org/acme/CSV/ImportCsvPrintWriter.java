package org.acme.CSV;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImportCsvPrintWriter {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get("bebidaTest.csv"));  // nome do arquivo csv a ser lido
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("a", "b", "c").withIgnoreHeaderCase().withTrim()); // parametros de colunas
        File f = new File("V2.0.2__insert_bebidaSemAlcool2.sql");  // nome do novo arquivo
        PrintWriter pw = new PrintWriter( f );

        for (CSVRecord csvRecord: csvParser) {

            String id = csvRecord.get(0);

            String nome = csvRecord.get(1);

            String tipo = csvRecord.get(2);

            String message = String.format("INSERT INTO bebidaSemAlcool (id, nome, tipo) VALUES('%s', '%s', '%s');", id, nome, tipo);
            pw.println(message);

        }
        pw.close();
        System.out.println("Arquivo: " + f + "criado com sucesso!");


    }
}