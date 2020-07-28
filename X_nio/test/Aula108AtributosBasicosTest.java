package estudo.javacore.X_nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula108AtributosBasicosTest {
    public static void main(String[] args) throws IOException {
        Date primeiroDeDezembro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
        File file = new File ("Aula108\\arquivo.txt");
        file.createNewFile();
        file.setLastModified(primeiroDeDezembro.getTime());
        System.out.println(file.lastModified());
        file.delete();

        Path path = Paths.get("Aula108\\arquivo2.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);

        Path path2 = Paths.get("C:\\Users\\rodrigo.g.muniz\\Dropbox\\Cursos-Estudos-\\EstudoJava\\src\\estudo\\introducao\\operadores\\Aula06Operadores.java");
        System.out.println(Files.isReadable(path2));
        System.out.println(Files.isWritable(path2));
        System.out.println(Files.isExecutable(path2));

        //BasicFileAttributes, PosixFileAttributes, DosFileAttributes
        BasicFileAttributes atributosBasicos = Files.readAttributes(path2, BasicFileAttributes.class);
        System.out.println("data de criação: "+atributosBasicos.creationTime());
        System.out.println("ultimo acesso: "+atributosBasicos.lastAccessTime());
        System.out.println("ultima modificação: "+atributosBasicos.lastModifiedTime());
//        System.out.println(atributosBasicos.isDirectory());
//        System.out.println(atributosBasicos.isSymbolicLink());
//        System.out.println(atributosBasicos.isRegularFile());

        //BasicFileAttributeView, PosixFileAttributeView, DosFileAttributeView,
        // FileOwnerAttributeView, AclFileAttributeView
        FileTime lastmodified = atributosBasicos.lastModifiedTime();
        FileTime created = atributosBasicos.creationTime();
        FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView basicView = Files.getFileAttributeView(path2, BasicFileAttributeView.class);
        basicView.setTimes(lastmodified, lastAcess, created);

        atributosBasicos = Files.readAttributes(path2, BasicFileAttributes.class);
        System.out.println("====================================================");
        System.out.println("data de criação: "+atributosBasicos.creationTime());
        System.out.println("ultimo acesso: "+atributosBasicos.lastAccessTime());
        System.out.println("ultima modificação: "+atributosBasicos.lastModifiedTime());


    }
}
