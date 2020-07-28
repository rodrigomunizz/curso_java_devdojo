package estudo.javacore.T_data.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Aula88SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        String mascara = "'Brazil,' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);

        System.out.println(formatador.format(cal.getTime()));

        System.out.println("-----------");

        System.out.println(formatador);



    }
}
