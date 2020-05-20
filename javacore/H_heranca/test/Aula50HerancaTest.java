package estudo.javacore.H_heranca.test;

/*Os níveis são os que você disse: private, default, protected e public

Private: A única classe que tem acesso ao atributo é a própria classe que o define, ou seja, se uma classe Pessoa declara um atributo privado chamado nome, somente a classe Pessoa terá acesso a ele.

Default: Tem acesso a um atributo default (identificado pela ausência de modificadores) todas as classes que estiverem no mesmo pacote que a classe que possui o atributo.

Protected: Esse é o que pega mais gente, ele é praticamente igual ao default, com a diferença de que se uma classe (mesmo que esteja fora do pacote) estende da classe com o atributo protected, ela terá acesso a ele. Então o acesso é por pacote e por herança.

Public: Esse é fácil, todos tem acesso :)*/

//1 - espaco em memoria é alocado para o objeto sendo construído;
//2 - cada um dos atributos do objeto é criado e inicializado com os valores default;
//3 - o contrutor da superclasse é chamado;
//4 - a inicialização dos atributos via declaração e o código do bloco de inicialização da superclasse
//        são executados na ordem que aparecem;
//5 - o codigo do construtor da superclasse é chamado;
//6 - passo 4 para subclasse;
//7 - o codigo do construtor da classe é executado;



import estudo.javacore.H_heranca.classes.Aula50Endereco;
import estudo.javacore.H_heranca.classes.Aula50Funcionario;
import estudo.javacore.H_heranca.classes.Aula50Pessoa;

public class Aula50HerancaTest {
    public static void main(String[] args) {
//        Aula50Pessoa p1 = new Aula50Pessoa("Munizz");

        //p1.setNome("Muniz");
//        p1.setCpf("435262456");

        Aula50Endereco end1 = new Aula50Endereco();

        end1.setBairro("Piedade");
        end1.setRua("Alvorada 69");

//        p1.setEndereco(end1);

        //p1.imprime();

        System.out.println("--------------------------------------------------");

        Aula50Funcionario f1 = new Aula50Funcionario("Renata");

        //f1.setNome("Renata");
        f1.setCpf("987654321");
        f1.setSalario(3456);

        Aula50Endereco end2 = new Aula50Endereco();

        end2.setBairro("Piedade re");
        end2.setRua("Alvorada 96");

        f1.setEndereco(end2);

        //f1.imprime();

    }
}
