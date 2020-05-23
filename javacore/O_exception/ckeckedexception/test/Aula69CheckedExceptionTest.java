package estudo.javacore.O_exception.ckeckedexception.test;

import java.io.File;
import java.io.IOException;

public class Aula69CheckedExceptionTest {
    public static void main(String[] args) {
        criarArquivo();
    }

    public static void criarArquivo() {
        File file = new File("teste.txt");
        try {
            //tem que ter um metodo que lance a exceção abaixo
            System.out.println("Arquivo criado? : " + file.createNewFile());
            System.out.println("Arquivo criado!");
        } catch (IOException e) {
            System.out.println("Entrou no IOexception");
            e.printStackTrace();
        }


    }
}
