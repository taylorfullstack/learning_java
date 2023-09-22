package readAndWriteFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try {
            // Création d'un fileReader pour lire le fichier
            FileReader fileReader = new FileReader("./README.md");

            // Création d'un bufferedReader qui utilise le fileReader
            BufferedReader reader = new BufferedReader(fileReader);

            // une fonction à essayer pouvant générer une erreur
            String line = reader.readLine();

            while (line != null) {
                // affichage de la ligne
                System.out.println(line);
                // lecture de la prochaine ligne
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

