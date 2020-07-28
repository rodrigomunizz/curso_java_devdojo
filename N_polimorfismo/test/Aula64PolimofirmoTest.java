package estudo.javacore.N_polimorfismo.test;

import estudo.javacore.N_polimorfismo.classes.Aula64Gerente;
import estudo.javacore.N_polimorfismo.classes.Aula64RelPagamento;
import estudo.javacore.N_polimorfismo.classes.Aula64Vendedor;

public class Aula64PolimofirmoTest {
    public static void main (String[] args){

        Aula64Gerente ger = new Aula64Gerente("Luciano",15000,5000);
        Aula64Vendedor ven = new Aula64Vendedor("Fulano de Tal", 8000, 500);

        Aula64RelPagamento relat = new Aula64RelPagamento();

        //relat.relPagamentoGerente(ger);
        //relat.relPagamentoVendedor(ven);

        relat.relPagamentoGeral(ger);
        System.out.println("--------------------------------------------");
        relat.relPagamentoGeral(ven);



    }
}
