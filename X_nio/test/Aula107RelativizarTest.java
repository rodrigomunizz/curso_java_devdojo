package estudo.javacore.X_nio.test;

import javax.sound.midi.Patch;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula107RelativizarTest {
    public static void main(String[] args) {
        Path dir = Paths.get ("/Aula107/home/java");
        Path classe = Paths.get ("/Aula107/home/java/classes/Pessoa.java");

        Path pathToClasse = dir.relativize(classe);

        System.out.println(pathToClasse);

        System.out.println("###############");

        Path absoluto1 = Paths.get("/Aula107/home/java");
        Path absoluto2 = Paths.get("/user/local");
        Path absoluto3 = Paths.get("/Aula107/home/java/classes/Pessoa.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/funcionario.java");

        System.out.println("1 : " + absoluto1.relativize(absoluto2));
        System.out.println("2 : " + absoluto1.relativize(absoluto3));
//        System.out.println("3 : " + absoluto1.relativize(relativo1));
//        System.out.println("4 : " + absoluto1.relativize(relativo2));
        System.out.println("5 : " + absoluto3.relativize(absoluto1));
        System.out.println("6 : " + absoluto3.relativize(absoluto2));
//        System.out.println("7 : " + absoluto3.relativize(relativo1));
//        System.out.println("8 : " + absoluto3.relativize(relativo2));
//        System.out.println("9 : " + relativo1.relativize(absoluto1));
//        System.out.println("10 : " + relativo1.relativize(absoluto2));
//        System.out.println("11 : " + relativo1.relativize(absoluto3));

    }
}
