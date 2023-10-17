import java.io.*;
public class Extraction {
    private String nomFichier = "input.txt";
    private String data = "";

    public String extractionData() {
        try {
            FileReader fileReader = new FileReader(nomFichier);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String ligne;
            while ((ligne = bufferedReader.readLine()) != null) {
                this.data = this.data.concat(ligne);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
