package estudo.javacore.O_exception.customexceptions.classes;

public class Aula75LoginInvalidoException extends Exception {

    public Aula75LoginInvalidoException(){
        super("Usuario ou senha invalido");
    }

    // nao coloque tratamento nas classes de exception ..
    // classes de exceção nao devem tratar nenhum tipo de exceção
}
