package estudo.javacore.M_Interfaces.test;

import estudo.javacore.M_Interfaces.classes.Aula62Produto;
import estudo.javacore.M_Interfaces.classes.Aula62Tributavel;

public class Aula62TestProduto {
    public static void main (String[] args){
        Aula62Produto produto = new Aula62Produto("Notebook",4,3000);

        //Aula62Tributavel tribut = new Aula62Tributavel();
        //isso nao pode - nao podemos instanciar uma interface
        //Error:(10, 35) java: estudo.javacore.M_Interfaces.classes.Aula62Tributavel is abstract; cannot be instantiated


        produto.calcularImposto();
        produto.calcularFrete();

        System.out.println(produto);


    }
}
