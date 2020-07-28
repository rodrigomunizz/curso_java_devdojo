package estudo.javacore.E_blocodeinicializacao.test;

import estudo.javacore.E_blocodeinicializacao.classes.Aula41Cliente;

public class Aula41ClienteTest {
    public static void main (String[] args){
        Aula41Cliente cliente01 = new Aula41Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis: ");

        for (int parcela : cliente01.getParcelas()){
            System.out.print(parcela + " ");
        }


    }

}
