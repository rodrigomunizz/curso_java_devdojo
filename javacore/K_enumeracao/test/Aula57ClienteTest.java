package estudo.javacore.K_enumeracao.test;

import estudo.javacore.K_enumeracao.classes.Aula57Cliente;
import estudo.javacore.K_enumeracao.classes.Aula57Cliente2;
import estudo.javacore.K_enumeracao.classes.Aula57TipoCliente;

public class Aula57ClienteTest {
    public static void main(String[] args) {
        Aula57Cliente cliente = new Aula57Cliente("Ana Furtado", 2, Aula57Cliente.TipoPagamento.A_PRAZO);

        Aula57Cliente2 cliente2 = new Aula57Cliente2("Vera Lucia", Aula57TipoCliente.PESSOA_FISICA);

        System.out.println(cliente2);
        System.out.println("--------------------------------");
        System.out.println(cliente);
        System.out.println("--------------------------------");
        System.out.println(Aula57TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println("--------------------------------");
        System.out.println(Aula57TipoCliente.PESSOA_FISICA.getId());
        System.out.println("--------------------------------");
        System.out.println(cliente2);
    }
}

//constant specific class body
//corpo de classe específico constante