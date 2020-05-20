package estudo.javacore.I_sobrescrita.test;

import estudo.javacore.I_sobrescrita.classes.Aula55Pessoa;

public class Aula55PessoaTest {
    public static void main (String[] args){
        Aula55Pessoa pessoa = new Aula55Pessoa();

        pessoa.setNome("Rodrigo Muniz");
        pessoa.setIdade(35);

        System.out.println(pessoa.toString());
        System.out.println(pessoa);
    }
}
