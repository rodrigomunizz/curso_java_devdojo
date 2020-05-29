package estudo.javacore.O_exception.ckeckedexception.test;

import estudo.javacore.O_exception.ckeckedexception.classes.Aula74Leitor1;
import estudo.javacore.O_exception.ckeckedexception.classes.Aula74Leitor2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;

public class Aula74TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivofinal();
    }

    public static void lerArquivofinal(){
        try(Aula74Leitor1 leitor1 = new Aula74Leitor1();
            Aula74Leitor2 leitor2 = new Aula74Leitor2();){
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo(){
         try(Reader reader = new BufferedReader(new FileReader("text.txt"));){

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivoold(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try{
                if(reader!=null){
                    reader.close();
                }
            }catch (IOException e){
            }
        }
    }
}