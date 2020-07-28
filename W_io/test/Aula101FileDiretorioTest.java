package estudo.javacore.W_io.test;

import java.io.File;
import java.io.IOException;

public class Aula101FileDiretorioTest {
    public static void main(String[] args) {
//        File newdiretorio = new File("folder");
//
///*        try {
//            newfile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }*/
//
//        boolean mkdir = newdiretorio.mkdir();
//
//        System.out.println("Diretorio criado: "+mkdir);
//
//        //File newfile = new File("C:\\Users\\rodrigo.g.muniz\\Dropbox\\Cursos-Estudos-\\EstudoJava\\folder\\aula101.txt")
//        File newfile = new File (newdiretorio, "aula101.txt");
//
//        boolean filecreated = false;
//        try {
//            filecreated = newfile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Arquivo criado: "+filecreated);
//
//        File newrename = new File (newdiretorio, "aula101renomeado.txt");
//
//        boolean rename = newfile.renameTo(newrename);
//
//        System.out.println("Arquivo renomeado: "+rename);

        buscarArquivos();

    }

    public static void buscarArquivos(){
        File file = new File ("C:\\Users\\rodrigo.g.muniz\\Dropbox\\Cursos-Estudos-\\EstudoJava");
        String[] list = file.list();
        for(String arquivo : list){
            System.out.println(arquivo);
        }
    }
}
