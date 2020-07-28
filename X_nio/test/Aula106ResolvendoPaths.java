package estudo.javacore.X_nio.test;

import java.awt.event.AdjustmentEvent;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula106ResolvendoPaths {
    public static void main(String[] args) {
        Path dir = Paths.get("Aula105\\home");
        Path arquivo = Paths.get("teste\\arquivo.txt");

        Path result = dir.resolve(arquivo);

        System.out.println(result);

        Path absoluto = Paths.get("/Aula105/home/");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1: "+absoluto.resolve(relativo));
        System.out.println("2: "+absoluto.resolve(file));
        System.out.println("3: "+relativo.resolve(absoluto));
        System.out.println("4: "+relativo.resolve(file));
        System.out.println("5: "+file.resolve(absoluto));
        System.out.println("6: "+file.resolve(relativo));

    }
}
