package estudo.javacore.O_exception.ckeckedexception.test;

import estudo.javacore.O_exception.ckeckedexception.classes.Aula76Funcionario;
import estudo.javacore.O_exception.ckeckedexception.classes.Aula76Pessoa;
import estudo.javacore.O_exception.customexceptions.classes.Aula75LoginInvalidoException;

import java.io.FileNotFoundException;

public class Aula76SobrescritaComExceptionsTest {

    public static void main(String[] args) throws FileNotFoundException, Aula75LoginInvalidoException {
        Aula76Funcionario funci = new Aula76Funcionario();
        Aula76Pessoa pessoa = new Aula76Pessoa();

        funci.salvar();

        pessoa.salvar();


    }
}
