package estudo.javacore.F_modificadorestatico.test;

import estudo.javacore.F_modificadorestatico.classes.Aula44Cliente;

public class Aula44ClienteTest {
    public static void main (String[] args){
        Aula44Cliente cliente01 = new Aula44Cliente();
        Aula44Cliente cliente02 = new Aula44Cliente();
        Aula44Cliente cliente03 = new Aula44Cliente();

        System.out.println("Exibindo quantidade de parcelas possiveis: ");

//        for (int parcela : cliente01.getParcelas()){
//            System.out.print(parcela + " ");
//        }

        System.out.println("Tamanho = " + Aula44Cliente.getParcelas().length);

    }

}
