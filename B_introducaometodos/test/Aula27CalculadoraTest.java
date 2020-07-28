package estudo.javacore.B_introducaometodos.test;

import estudo.javacore.B_introducaometodos.classes.Aula27Calculadora;

//Java Completo - Aula 27: Introdução a métodos
//Java Completo - Aula 28: Métodos com parâmetros
//Java Completo - Aula 29: Retorno de métodos parte 01
//Java Completo - Aula 30: Retorno de métodos parte 02

public class Aula27CalculadoraTest {

    public static void main(String[] args) {

        Aula27Calculadora calc = new Aula27Calculadora();

        Aula27Calculadora.somaDoisNumeros();

        System.out.println("Continuando a execucao");

        calc.subtraiDoisNumeros();

        System.out.println("Chamando a multiplicação");

        calc.multiplicaDoisNumeros(5, 5);

        //System.out.println(num1);

        System.out.println("Chamando a divisão");

        System.out.println(calc.divideDoisNumeros(10, 2));

        double resultado = calc.divideDoisNumeros(100, 2);
        System.out.println(resultado);

        System.out.println(calc.divideDoisNumeros(10, 0));

        System.out.println("Chamando a impressao divisao de dois numeros");

        calc.imprimeDoisNumerosDivididos(20, 0);

        System.out.println("---");

        int[] numeros = new int[]{1, 2, 3, 4, 5};
        //int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);

        calc.somaVarArgs(5,6,7,8,9,10);

    }
}
