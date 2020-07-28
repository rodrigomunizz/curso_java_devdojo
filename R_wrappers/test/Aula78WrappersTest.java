package estudo.javacore.R_wrappers.test;

public class Aula78WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;

        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        // não estamos mais trabalhando com primitivo. e sim com objetos
        // e regras de herança e polimofirmos funcionam com as variaveis abaixo
        Byte byteWrapper = 1; // de 1 ate 127 byte
        Short shortWrapper = 1;
        Integer integerWrapper = 10; // mais de 127 = int
        Integer integerWrapper2 = Integer.valueOf("10");
        Long longWrapper = 10L;
        Long longWrapper2 = new Long(10);
        Float floatWrapper = 10F;
        Float floatWrapper2 = new Float("10");
        Double doubleWrapper = 10D;

        Character characterWrapper = 'A';
        Boolean booleanWrapper = true;

        Character.isDigit('9');// pra verificar se é um digito
        Character.isLetter('A'); //pra verificar se em letra
        //Character.isLetterOrDigit();
        //Character.isUpperCase();
        //Character.toUpperCase();
        //Character.toLowerCase();

        String valor = "10";
        Float f = Float.parseFloat(valor);

    }
}
