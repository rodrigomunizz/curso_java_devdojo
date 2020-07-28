package estudo.javacore.T_data.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Aula87NumberFormatTest {
    public static void main(String[] args) {
        float valor = 123.4567f;
        Locale looJP = new Locale("jp");
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(looJP);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(looJP);

        for (NumberFormat nf : nfa){
            System.out.println(nf.format(valor));
        }
        NumberFormat nf = NumberFormat.getInstance();

        String valor2 = "213.567";

        try{
            System.out.println(nf.parse(valor2));
        } catch (ParseException e){
            e.printStackTrace();
        }

    }
}
