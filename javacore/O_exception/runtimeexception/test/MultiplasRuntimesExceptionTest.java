package estudo.javacore.O_exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimesExceptionTest {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
            //throw new IllegalArgumentException();  -Error:(7, 13) java: unreachable statement

            //throw new RuntimeException()
            //exceção nao tratada e o sistema volta pro metodo main (metodo que chamou)
            // e para de executar

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dentro do arrayindexoutboundsexception");

        }catch (IllegalArgumentException e){
            System.out.println("dentro do illegalargumentexception");

        }catch (ArithmeticException e){
            System.out.println("dentro do arithmeticexception");

        }finally {
            System.out.println("Sempre executa");
        }

        System.out.println("execução fora");

        try{
            talvezLanceException();
        }catch (SQLException | IOException e){
            System.out.println("dentro do catch do java 7");
        }

    }

    private static void talvezLanceException() throws SQLException, IOException{
        return;
    }

}

