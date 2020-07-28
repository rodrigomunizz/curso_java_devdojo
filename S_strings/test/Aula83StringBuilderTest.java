package estudo.javacore.S_strings.test;

public class Aula83StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";

        //StringBuilder sb = s;
        //erro de compilação -
        // Error:(7, 28) java:
        // incompatible types:
        // java.lang.String cannot be converted to java.lang.StringBuilder

        StringBuilder sb = new StringBuilder(16);
        StringBuilder sb2 = new StringBuilder(16);


        sb.append("Uma frase comum no builder");
        sb.append(". Entendeu?");

        System.out.println(sb.reverse());
        System.out.println(sb.delete(0,2));
        //pra iniciar, ele inicia do 0,
        // mas o final ele começa a contar da primeira letra no 1.

        sb2.append("abc").insert(3,"ghi").reverse().delete(2,4);




    }
}
