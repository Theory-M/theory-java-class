package pl.learn.theory.javaclass1.solid.open_close_principle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Secret {

    private String mySecret;
    private String path;

    public void save(){

        // zbudowac strumien
        // wyslac dane do strumienia
        System.out.println(String.format("Saving secret to file [%s]", path));

        // jakbym chcial rzeczywiscie zapisaywac, to cos takiego + exc importowane
//        Writer writer = new BufferedWriter(new FileWriter(path));
    }

    public Secret(String mySecret, String path) {
        this.mySecret = mySecret;
        this.path = path;
    }

    public String getMySecret() {
        return mySecret;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "mySecret='" + mySecret + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
