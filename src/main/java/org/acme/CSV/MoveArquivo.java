package org.acme.CSV;

import java.io.File;

public class MoveArquivo {

    public static void main(String[] args) {

        // Arquivo a ser movido
        File arquivo = new File("V2.0.2__insert_bebidaSemAlcool2.sql");

        if (!arquivo.exists()) {
            System.out.println("Arquivo não encontrado");
        } else {

            // Diretorio de destino
            File diretorioDestino = new File("src/main/resources/db/dev");

            // Move o arquivo para o novo diretorio
            boolean sucesso = arquivo.renameTo(new File(diretorioDestino, arquivo.getName()));
            if (sucesso) {
                System.out.println("Arquivo " + arquivo + "movido para '" + diretorioDestino.getAbsolutePath() + "'");
            } else {
                System.out.println("Erro ao mover arquivo '" + arquivo.getAbsolutePath() + "' para '"
                        + diretorioDestino.getAbsolutePath() + "'");
            }
        }
    }
}