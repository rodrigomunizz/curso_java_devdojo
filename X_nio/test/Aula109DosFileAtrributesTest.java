package estudo.javacore.X_nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class Aula109DosFileAtrributesTest {
    public static void main(String[] args) {
        Path newPath = Paths.get ("Aula109\\teste.txt");
        try {
            Files.createFile(newPath);
            Files.setAttribute(newPath,"dos:hidden",true);
            Files.setAttribute(newPath, "dos:readonly", true);
            DosFileAttributes dos = Files.readAttributes(newPath, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());

            DosFileAttributeView dosView = Files.getFileAttributeView(newPath, DosFileAttributeView.class);
            dosView.setHidden(false);
            dosView.setReadOnly(false);
            DosFileAttributes dos2 = Files.readAttributes(newPath, DosFileAttributes.class);
            System.out.println(dos2.isHidden());
            System.out.println(dos2.isReadOnly());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
