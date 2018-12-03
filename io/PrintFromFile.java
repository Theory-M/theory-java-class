package pl.learn.theory.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintFromFile {

    public static void main(String[] args) throws IOException {

        // czytanie i wypisywanie tekstu z pliku:
        File maybeFile = new File("/home/theory/test/krotki");

        try (
                FileReader reader = new FileReader("/home/theory/test/krotki")
        ) {
            int charRead = -1;

            while ((charRead = reader.read()) != -1) {
                System.out.print((char) charRead);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File not found error: " + ex);
        } catch (IOException ex) {
            System.err.println("I/O error: " + ex);
        }
    }
}
