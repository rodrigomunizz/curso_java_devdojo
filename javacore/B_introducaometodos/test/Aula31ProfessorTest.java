package estudo.javacore.B_introducaometodos.test;

import estudo.javacore.B_introducaometodos.classes.Aula31Professor;

// Java Completo - Aula 32: Passagem de objeto como parâmetro e this pt 02

public class Aula31ProfessorTest {
    public static void main (String[] args){
        Aula31Professor prof = new Aula31Professor();
        prof.CPF = "111.222.333-98";
        prof.RG = "11111111.1";
        prof.nome = "Chata Numero 1";
        prof.matricula = "123456";

        Aula31Professor prof2 = new Aula31Professor();
        prof2.CPF = "111.222.333-98";
        prof2.RG = "11111111.1";
        prof2.nome = "Chata Numero 2";
        prof2.matricula = "654321";

        System.out.println("Dentro do professor test:" );
        System.out.println( prof.nome );

        prof.imprime(prof);
//        prof.imprime(prof2);

        System.out.println(prof.nome);

        //System.out.println (prof.CPF);
        //System.out.println (prof.RG);
        //System.out.println (prof.nome);
        //System.out.println (prof.matricula);

        System.out.println("===========================" );

        prof.imprimeNovo();
        System.out.println("---");
        prof2.imprimeNovo();

    }
}
