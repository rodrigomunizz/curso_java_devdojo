package estudo.javacore.S_strings.test;

//String é uma classe. logo você pode criar objeto.
//String são imutaveis

public class Aula80StringTest {
    public static void main(String[] args) {
        String nome = "Rodrigo";
        String namorada = "Renata";
        String sobrenome = new String("Muniz"); //referenciando objeto
        // criando uma variaves de referencia
        //objeto de tipo string
        //um string no pool de string

        System.out.println(nome + " " + sobrenome);

        nome = nome + " Muniz";

        System.out.println(nome);

        namorada.concat(" Boa Viagem");

        System.out.println(namorada);

        namorada = namorada.concat(" Boa Viagem");
        //concatencar se vc referenciar a variavel
        //namorada += " Boa Viagem";

        System.out.println(namorada);

        System.out.println(namorada.charAt(7));
        //peha a letra

        System.out.println(nome.equals(namorada));
        //comparar strings

        System.out.println(namorada.length());
        //verificar tamanho

        System.out.println(namorada.substring(0,3));
        //pra iniciar, ele inicia do 0,
        // mas o final ele começa a contar da primeira letra no 1.

        String testeTrim = "   ab  cd ";
        System.out.println(testeTrim.trim());
        //retira os espaços no inicio e fim

    }
}
