package estudo.javacore.O_exception.customexceptions.test;

import estudo.javacore.O_exception.customexceptions.classes.Aula75LoginInvalidoException;

import java.sql.SQLOutput;

public class Aula75CustomExceptionTest {
    public static void main(String[] args) throws Aula75LoginInvalidoException {
        logar();
    }

    public static void logar() throws Aula75LoginInvalidoException {
        String usuario = "Goku";
        String senha = "111";
        String usuariodigitado = "Goku";
        String senhadigitada = "123";
        if (usuariodigitado.equals(usuario)) {
            if (senhadigitada.equals(senha)) {
                System.out.println("Usuário logado");
            }else{
                throw new Aula75LoginInvalidoException();
            }
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }
}
