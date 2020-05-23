package estudo.javacore.O_exception.runtimeexception.test;

public class Aula68RuntimeExceptionTest {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        if ( b != 0 ){
            int c = a / b;
            System.out.println(c);
            //runtimeexception
            //ArithmeticException
        }else{
            System.out.println("B = 0 - naum pode");
        }

        System.out.println("================================");

//        Object o = null;
//        System.out.println(o.toString());
//        //runtimeexception
//        //NullPointerException

        System.out.println("================================");

        try{
            int [] d = new int[2];
            d[0] = 1;
            d[1] = 2;
            System.out.println(d[2]);
        }catch (RuntimeException e){
            System.out.println("Teste");
            e.printStackTrace();
            System.out.println("Teste2");
        }


        //runtimeexception
        //ArrayIndexOutOfBoundsException


    }
}
