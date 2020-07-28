package estudo.javacore.O_exception.ckeckedexception.classes;

public class Aula74Leitor2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 2");
    }
}
