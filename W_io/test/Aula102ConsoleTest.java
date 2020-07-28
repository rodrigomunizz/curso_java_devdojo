package estudo.javacore.W_io.test;

import java.io.Console;

public class Aula102ConsoleTest {
    public static void main(String[] args) {
        Console cons = System.console();
        char[] passw = cons.readPassword("%s", "pw: ");
        for(char pass : passw){
            cons.format("%c ", pass);
        }
        cons.format("\n");

        String texto;
        while(true){
            texto = cons.readLine("%s", "Digite: ");
            cons.format("O texto digitado foi '%s'\n", retorno(texto) );
        }
    }

    public static String retorno (String arg1){
        return arg1;
    }
}
