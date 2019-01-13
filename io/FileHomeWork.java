
package pl.learn.theory.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileHomeWork {

    public static void main(String[] args) throws IOException {

        try (

                FileReader reader = new FileReader("/home/theory/test/krotki");
                FileWriter writer = new FileWriter("/home/theory/test/krotkicopy");
        ) {

            int charRead = -1;

            while ((charRead = reader.read()) != -1) {
                writer.write(charRead);
            }

        } catch (IOException ex) {
            System.err.println(ex);
        }

        // delete old file
        File file = new File("/home/theory/test/krotki");
        if (file.exists()){
            file.delete();
        }

        //rename new file to old name
        File fileNew = new File("/home/theory/test/krotkicopy");

        // File (or directory) with new name
        File file2 = new File("/home/theory/test/krotki");

        if (file2.exists())
            throw new java.io.IOException("file exists");

        // Rename file (or directory)
        boolean success = fileNew.renameTo(file2);

        if (!success) {
            // File was not successfully renamed
        }


        // dodawanie textu na koncu pliku
        try {
            Files.write(Paths.get("/home/theory/test/krotki"), "\n *".getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            //exc handling left as an exercise for the reader
        }
    }
}
