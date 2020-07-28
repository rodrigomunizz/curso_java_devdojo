package estudo.javacore.T_data.test;

import java.util.Calendar;
import java.util.Date;


public class Aula84ManipulaçãoDeDatasTest {
    public static void main(String[] args) {
        Date date01 = new Date(1L);
//
//        System.out.println(date01);
//
        Date date02 = new Date ();
//
//        System.out.println(date02);

        Calendar c = Calendar.getInstance();
        //classe abstrata. não funciona o new
        System.out.println(c);

        c.setTime(date02);

        if (Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("Hoje é domingo");
        }

        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        c.add(Calendar.HOUR, 24);

        System.out.println(c.getTime());

/*      NumberFormat;
        Locale;
        Calendar;
        Date;
        DateFormat;*/


    }
}
