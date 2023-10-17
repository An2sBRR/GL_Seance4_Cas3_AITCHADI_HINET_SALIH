import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Enregistrement {
    String nomFichier = "output.txt";
    void sauvegarder(String data){
        File fichier = new File(nomFichier);
        FileWriter writer = null;
        try {
            writer = new FileWriter(fichier);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(data);
            bufferedWriter.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
