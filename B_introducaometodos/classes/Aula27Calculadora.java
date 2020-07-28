package estudo.javacore.B_introducaometodos.classes;

// Java Completo - Aula 27: Introdução a métodos
// Java Completo - Aula 28: Métodos com parâmetros
// Java Completo - Aula 29: Retorno de métodos parte 01
// Java Completo - Aula 30: Retorno de métodos parte 02

public class Aula27Calculadora {

    // public é um modificador de acesso
    //void -> metodo sera executado e não ira retornar nada

    public static void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        //double resultado = num1 / num2;
        //return resultado;
        //ou
        // return num1/num2;

        System.out.println("dentro da classe = " + num1 / num2);
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {

        if (num2 != 0) {
            System.out.println(num1 / num2);
            return; //funciona como um break
        }//else{
        System.out.println("naum possivel");
        //}

    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera valores");
        System.out.println(num1 + " : numero 1");
        System.out.println(num2 + " : numero 2");
    }
    //System.out.println("Nao eh executado");

    public void somaArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma = soma + num;
            // soma += num;
        }
        System.out.println(soma);
    }

    // só pode ter um VarArgs por assinatura de metodos.
    // VarArgs tem que ser a ultima solicitação
    public void somaVarArgs(int... numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma = soma + num;
            // soma += num;
        }
        System.out.println(soma);
    }
}
