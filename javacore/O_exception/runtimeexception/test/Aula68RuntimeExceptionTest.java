package estudo.javacore.O_exception.runtimeexception.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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

        try{
            divisao(10,2);
            System.out.println("dentro do try");
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("após o try catch");

    }

    private static void divisao (int num1, int num2){
        if (num2==0){
            throw new IllegalArgumentException("Passe um valor diferente de zero para num 2");
        }else{
            int result = num1/num2;
            System.out.println(result);
        }

        System.out.println("após o if na divisao");
    }
}
