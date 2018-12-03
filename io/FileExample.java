package pl.learn.theory.io;

import java.io.*;

public class FileExample {

    public static void main(String[] args) {

        //maybe file bo sluzy do znajdywania plikow albo folderow
        File maybeFile = new File("/home/theory/test/krotki");
        System.out.println("file exists: " + maybeFile.exists());
        System.out.println("is directory: " + maybeFile.isDirectory());

        File existsngOneOrNot = new File("/dasd/adasd/ad");
        System.out.println("existingOrNot: " + existsngOneOrNot);

        // w metodzie trzeba zadeklarowac wartosc:
        Reader reader = null;
        Writer writer = null;

        try {
            reader = new FileReader("/home/theory/test/krotki");
            writer = new FileWriter("/home/theory/test/krotki");
            int readChar;
//            int readChar = reader.read();
            while ((readChar = reader.read()) != -1) {
                System.out.println("readChar: " + readChar);
                writer.write(readChar);
            }
            //spusc z bufora:
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

            // to jest wazne zeby skonczyc caly proces:
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // kolejnosc nie ma znaczenia "x != null" == "null != x"
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException xc) {
                    xc.printStackTrace();
                }

            }
        }
    }
}