package estudo.javacore.U_expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aula89ExpressoesRegularesTest {
    public static void main(String[] args) {

        // \\d - todos os digitos
        // \\D - todos os que não foram digitos
        // \\s - todos os espaços em branco \t \n \f \r
        // \\S - caractere que não é branco
        // \\w - caraceteres de palavras - a-z - A-Z - 0-9 e _
        // \\W - carateres especiais
        // [] - procurar exatamente a letra dentro do []
        // ? - quantificador - 0 ou 1 ocorrencia
        // * - quantificador - 0 ou mais ocorrencia
        // + - quantificador - 1 ou mais
        // {n,m} - quantificador - de n ate m
        // () - quantificador - agrupador de expressão
        // | - ou
        // $ - fim de linha

        // exemplo
        // o(v|c)o - procure algo que comoce com "o", tenha "v" ou "c", e termine com "o"

        // . - caracter coringa - 1.3 = 123,133,1a3 e etc

        // ^ - negação

        //String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        //String texto = "12 0x 0X 23 0xFFABC 0x10f 0x1";

        //String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //"([\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        //String texto = "fulano@hotmail.com, rodrigo.muniz@gmail.com, 123abc@ig.com.br, $#%abrahao@mail.br, teste@mail";
        //System.out.println("Email valido?" + "$#%abrahao@mail.br".matches(regex));

        //String regex = "\\d\\d/\\d\\d/\\d{2,4}";
        //String texto = "05/10/2020 05/05/2017 1/1/2021 01/01/20"; // dd/mm/yyyy

        String regex = "proj([^,final])*";
        String texto = "proj1.bpk, proj1.java, proj1.class, proj1final.java, proj2.class, proj2.java";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: "+texto);
        //System.out.println("Indc : 0123456789012345678901234567890");
        System.out.println("Expressao: "+matcher.pattern());

        System.out.println("----");

        System.out.println("posições encontradas:");

        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
