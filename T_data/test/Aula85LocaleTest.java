package estudo.javacore.T_data.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Aula85LocaleTest {
    public static void main(String[] args) {
        //ISO 639
        Locale localizacao = new Locale("pt", "BR");
        Locale localizacao2 = new Locale("it", "CH");
        Locale locJapao = new Locale ("ja");

        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER, 23);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localizacao);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localizacao2);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);

        System.out.println("Brasil, " +df.format(c.getTime()));
        System.out.println(df2.format(c.getTime()));

        System.out.println(locJapao.getDisplayLanguage(localizacao));

        System.out.println(localizacao.getDisplayCountry());


    }
}
