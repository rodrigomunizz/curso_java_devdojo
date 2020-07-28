package estudo.javacore.W_io.test;

import javax.sound.midi.Soundbank;
import java.io.*;

public class Aula100BufferedTest {
    public static void main(String[] args) {

        File filecreation = new File("Aula100.txt");

        try {
            FileWriter filewriter = new FileWriter(filecreation);
            BufferedWriter bufferw = new BufferedWriter(filewriter);

            bufferw.write("Escrevendo mensagem dentro do arquivo.");
            bufferw.newLine();
            bufferw.write("E pula uma linha.");

            bufferw.flush();//limpar memoria
            bufferw.close();//fechar

            FileReader filereader = new FileReader(filecreation);
            BufferedReader bufferr = new BufferedReader(filereader);

            String s = null;

            while ((s=bufferr.readLine()) != null){
                System.out.println(s);
            }

            bufferr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
