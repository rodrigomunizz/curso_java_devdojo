package estudo.javacore.O_exception.ckeckedexception.test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Aula69CheckedExceptionTest {
    public static void main(String[] args) {
        //criarArquivo();
        abrirArquivo();

/*        try{
            criarArquivo2();
        }catch(IOException e) {
            e.printStackTrace();
        }*/
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

    public static void criarArquivo2() throws IOException{
        File file2 = new File("teste2.txt");
        System.out.println("Arquivo criado? : " + file2.createNewFile());
        System.out.println("Arquivo criado!");

    }

    //Aula 71
    public static void abrirArquivo(){
        try{
            System.out.println("Abrindo um arquivo");
            System.out.println("Leitura do arquivo");
            System.out.println("Escrevendo o arquivo");
            throw new Exception();
            //System.out.println("Fechar o arquivo");
        }catch(Exception e){
            //System.out.println("Fechar o arquivo");
            System.out.println("caiu na excecao");
            e.printStackTrace();
        }finally{// é executado sempre... ate se o try tiver retorno de valor
            // pode ser try - catch , ou try - finally, ou try - catch - finally
            System.out.println("Fechar o arquivo");
        }
    }

}