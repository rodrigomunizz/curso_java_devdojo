package estudo.javacore.T_data.test;

import java.text.DateFormat;
import java.util.Calendar;
//import java.util.Date;

public class Aula85DateFormatTest {
    public static void main(String[] args) {
        Calendar calen = Calendar.getInstance();
        DateFormat[] datForm = new DateFormat[6];

        datForm[0] = DateFormat.getInstance();
        datForm[1] = DateFormat.getDateInstance();
        datForm[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        datForm[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        datForm[4] = DateFormat.getDateInstance(DateFormat.LONG);
        datForm[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat df : datForm){
            System.out.println(df.format(calen.getTime()));
        }
    }
}
