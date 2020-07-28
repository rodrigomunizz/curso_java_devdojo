package estudo.javacore.V_resourcesbundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula96ResourcesBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());//localização do sistema en_US
        ResourceBundle rben = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        ResourceBundle rbpt = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
        System.out.println(rben.getString("hello"));
        System.out.println(rben.getString("good.morning"));
        System.out.println(rbpt.getString("hello"));
        System.out.println(rbpt.getString("good.morning"));

        System.out.println(rben.getString("show"));
        System.out.println(rbpt.getString("email"));

        // sequencia de busca do texto
        //Locale locale = new Locale ("fr","CA");
        //ResourceBundle.getBundle("messages", locale);
        //messages_fr_CA.properties >> messages_fr.properties >> messages_en_US.properties >>
        //messages_en.properties >> messages.properties >> Erro em tempo de execução



    }
}
