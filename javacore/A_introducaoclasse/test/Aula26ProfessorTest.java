package estudo.javacore.A_introducaoclasse.test;

import estudo.javacore.A_introducaoclasse.classes.Aula26Professor;

public class Aula26ProfessorTest {
    public static void main (String[] args){
        Aula26Professor prof = new Aula26Professor();

        prof.CPF = "111.111.111-98";
        prof.nome = "Maria Tereza";
        prof.RG = "111111111";
        prof.matricula = "MT123456";

        Aula26Professor prof2 = new Aula26Professor();

        prof2.CPF = "222.222.222-98";
        prof2.nome = "Renata Tereza";
        prof2.RG = "22222222";
        prof2.matricula = "RT123456";

        System.out.println (prof.CPF);
        System.out.println (prof.RG);
        System.out.println (prof.nome);
        System.out.println (prof.matricula);
        System.out.println ("-------------------");
        System.out.println (prof2.CPF);
        System.out.println (prof2.RG);
        System.out.println (prof2.nome);
        System.out.println (prof2.matricula);

    }
}
