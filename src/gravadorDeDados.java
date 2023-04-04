import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class gravadorDeDados implements Serializable {

    String outputFile = "arquivoDeTexto.txt";

    ObjectOutputStream output;

    public gravadorDeDados() throws IOException {
        this.output = new ObjectOutputStream(new FileOutputStream(outputFile));
    }

    public static void main(String[] args) {
        List<String> textList = new ArrayList<>();

        textList.add("cccccccccccccccccc");
        textList.add("bbbbbbbbbbbbbbbbbb");
        textList.add("aaaaaaaaaaaaaaaaaa");

        try {
            gravadorDeDados g = new gravadorDeDados();
            g.output.writeObject(textList);
            g.output.close();
        } catch(IOException ignored){
        }
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("inputFile"))){
        } catch(IOException ignored){
        }
    }
}


