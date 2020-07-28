package estudo.javacore.X_nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula105NormalizacaoTest {
    public static void main(String[] args) {
        String diretorioProjeto = "EstudoJava\\Aula105\\home\\teste";
        String arquivoTxt = "..\\..\\arquivo.txt";

        String diretoriaProjeto2 = "Aula105/./home/./teste";

        Path path1 = Paths.get(diretorioProjeto,arquivoTxt);

        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get(diretoriaProjeto2);

        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
