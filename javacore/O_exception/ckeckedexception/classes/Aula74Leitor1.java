package estudo.javacore.O_exception.ckeckedexception.classes;

public class Aula74Leitor1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 1");
    }
}
