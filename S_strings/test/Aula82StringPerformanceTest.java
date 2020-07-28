package estudo.javacore.S_strings.test;

public class Aula82StringPerformanceTest {
    public static void main(String[] args) {
        //metodo main
        long inicio = System.currentTimeMillis();
        concatString(20000);
        long fim = System.currentTimeMillis();
        System.out.println((fim-inicio) + "ms - tempo gasto na string.");

        System.out.println("################");

        long inicioBuilder = System.currentTimeMillis();
        concatStringBuilder(20000000);
        long fimBuilder = System.currentTimeMillis();
        System.out.println((fimBuilder-inicioBuilder) + "ms - tempo gasto na stringBuilder.");

        System.out.println("################");

        long inicioBuffer = System.currentTimeMillis();
        concatStringBuilder(20000000);
        long fimBuffer = System.currentTimeMillis();
        System.out.println((fimBuffer-inicioBuffer) + "ms - tempo gasto na stringBuffer.");

    }

    private static void concatString (int tam){
        String string ="";
        for (int i = 0; i < tam; i++ ){
            string += i;
        }
    }

    private static void concatStringBuilder (int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i = 0; i < tam; i++ ){
            sb.append(i);
        }
    }

    private static void concatStringBuffer (int tam){
        StringBuffer sb = new StringBuffer(tam);
        for (int i = 0; i < tam; i++ ){
            sb.append(i);
        }
    }
}
