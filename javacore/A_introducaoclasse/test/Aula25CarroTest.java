package estudo.javacore.A_introducaoclasse.test;

//Java Completo - Aula 25: Introdução a classes parte 2 + exercício


import estudo.javacore.A_introducaoclasse.classes.Aula25Carro;

public class  Aula25CarroTest {
    public static void main (String[] args){
        Aula25Carro carro1 = new Aula25Carro();//objeto tem que abrir e fechar ( )
        carro1.modelo = "FUSCA";
        carro1.placa = "PCA1234";
        //carro1.velocidadeMaxima = 120;

        System.out.println(carro1);

        System.out.println(carro1.placa);
        System.out.println(carro1.modelo);
        System.out.println(carro1.velocidadeMaxima);

    }
}