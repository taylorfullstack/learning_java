package readAndWriteFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            // Création d'un fileWriter pour écrire dans un fichier
            FileWriter fileWriter = new FileWriter("./README.md", true);

            // Création d'un bufferedWriter qui utilise le fileWriter
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Retour à la ligne
            writer.newLine();

            for (String j : args) {
                // ajout d'un texte à notre fichier
                writer.write(j);
                writer.newLine();
            }

            // Retour à la ligne
            writer.newLine();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
