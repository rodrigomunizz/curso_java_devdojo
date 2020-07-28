package estudo.javacore.W_io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Aula99FileWriterReaderTest {
    public static void main(String[] args) {
        File filecreation = new File("Arquivo.txt");

//        try {
//            FileWriter filewriter = new FileWriter (filecreation);
//            filewriter.write("Escrevendo mensagem dentro do arquivo.\nE pula uma linha.");
//            filewriter.flush();//limpar memoria
//            filewriter.close();//fechar
//
//            char[] in = new char[500];
//            FileReader filereader = new FileReader(filecreation);
//            int size = filereader.read(in);
//            System.out.println(filereader.read());
//            System.out.println("tamanho: "+size);
//            for (char c: in){
//                System.out.print(c);
//            }
//            filereader.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (FileWriter filewriter = new FileWriter(filecreation);
             FileReader filereader = new FileReader(filecreation)) {
            filewriter.write("Escrevendo mensagem dentro do arquivo.\nE pula uma linha.");
            filewriter.flush();//limpar memoria

            char[] in = new char[500];
            int size = filereader.read(in);
            System.out.println(filereader.read());
            System.out.println("tamanho: " + size);
            for (char c : in) {
                System.out.print(c);
            }

        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
