package estudo.javacore.B_introducaometodos.test;

import estudo.javacore.B_introducaometodos.classes.Aula27Calculadora;

// java Completo - Aula 31: Métodos com parâmetros tipo reference pt 01

public class Aula31ParametrosTest {
    public static void main(String[] args){
        Aula27Calculadora calc = new Aula27Calculadora();

        int num1 = 5;
        int num2 = 10;


        calc.alteraDoisNumeros(num1,num2);

        System.out.println("----------");
        System.out.println("Dentro do teste");
        System.out.println(num1 + " : numero 1");
        System.out.println(num2 + " : numero 2");

        //caracteristica do java usando tipo primitivo
    }

}
