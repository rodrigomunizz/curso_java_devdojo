package estudo.javacore.B_introducaometodos.test;

import estudo.javacore.B_introducaometodos.classes.Aula35Estudante;

//  Java Completo - Aula 35: Exercício sobre métodos

public class Aula35EstudanteTest {
    public static void main(String[] args) {

        Aula35Estudante newEstu = new Aula35Estudante();
        Aula35Estudante newEstu2 = new Aula35Estudante();

        newEstu.teste = 10;

        //newEstu.nomeAluno = "Rodrigo Muniz";
        newEstu.setNomeAluno("Rodrigo Muniz");
        newEstu2.setNomeAluno("Renata BV");

        //newEstu.idades = 35;
        newEstu.setIdades(35);
        //newEstu2.setIdades(-5);
        /*
        double[] notas = {8, 7, 9, 5};
        newEstu.notas = notas;
        */

        newEstu.setNotas(new double[]{8, 7, 9, 5});


        newEstu.imprimir();
        //newEstu2.imprimir();
        newEstu.tirarMedia();

        System.out.println("-------------------");

        //System.out.println(newEstu.getNomeAluno());

        System.out.println("-------------------");

        if (newEstu.isAprovado()==true){
            System.out.println("Aprovado - sim");
        }

    }
}
