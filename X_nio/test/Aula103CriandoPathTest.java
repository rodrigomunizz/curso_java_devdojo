package estudo.javacore.X_nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Aula103CriandoPathTest {
    public static void main(String[] args) {
        //C:\Users\rodrigo.g.muniz\Dropbox\Cursos-Estudos-\EstudoJava
        Path p1 = Paths.get("C:\\Users\\rodrigo.g.muniz\\Dropbox\\Cursos-Estudos-\\EstudoJava\\teste.txt");
        Path p2 = Paths.get("C:\\Users\\rodrigo.g.muniz\\Dropbox\\Cursos-Estudos-\\EstudoJava","teste.txt");
        Path p3 = Paths.get("C:","Users\\rodrigo.g.muniz\\Dropbox\\Cursos-Estudos-\\EstudoJava\\teste.txt");
        Path p4 = Paths.get("C:","Users","rodrigo.g.muniz","Dropbox\\Cursos-Estudos-\\EstudoJava\\teste.txt");

        System.out.println(p4.toAbsolutePath());

        File file = p3.toFile();
        Path path = file.toPath();

        Path criandopasta = Paths.get("Aula104");
        Path criandopastas = Paths.get ("Aula104//sub1//sub2");
        Path criandoarquivo = Paths.get ("Aula104//sub1//Aula104.txt");
        try {
//            if (Files.notExists(criandopasta)){
//                Files.createDirectory(criandopasta);
//            }
            if (Files.notExists(criandopastas.getParent())){
                Files.createDirectories(criandopastas.getParent());
            }

            if (Files.notExists(criandoarquivo)){
                Files.createFile(criandoarquivo);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Path source = Paths.get("C:\\Users\\rodrigo.g.muniz\\Dropbox\\Cursos-Estudos-\\EstudoJava\\teste2.txt");
        Path target = Paths.get(criandopastas.toString() + "\\arquivocopiado.txt");

        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            //Files.deleteIfExists(source);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
