package estudo.javacore.A_introducaoclasse.test;

import estudo.javacore.A_introducaoclasse.classes.Aula24Estudante;

// Java Completo - Aula 24: Introdução a classes parte 1

public class Aula24EstudanteTest {
    public static void main(String[] args){
        Aula24Estudante joao = new Aula24Estudante();
        //variavel de referencia chamada joão do tipo "aula24estudante"
        //fazendo referencia a um objeto do tipo "aula24estudante"
        joao.nome = "Joao";
        joao.matricula = "1212";
        joao.idade = 15;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }
}
