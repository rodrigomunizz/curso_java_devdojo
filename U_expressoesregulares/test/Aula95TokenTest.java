package estudo.javacore.U_expressoesregulares.test;

import java.sql.SQLOutput;

public class Aula95TokenTest {
    public static void main(String[] args) {
        String str = "Rodrigo, Renata, Tereza, Marcio";

        String[] tokens = str.split(",");

        for(String arr: tokens){
            System.out.println(arr);
        }
    }
}
