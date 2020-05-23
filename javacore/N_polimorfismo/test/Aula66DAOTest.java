package estudo.javacore.N_polimorfismo.test;

import estudo.javacore.N_polimorfismo.classes.Aula66ArquivoDAOImpl;
import estudo.javacore.N_polimorfismo.classes.Aula66DatabaseDAOImpl;
import estudo.javacore.N_polimorfismo.classes.Aula66GenericDAO;

public class Aula66DAOTest {
    public static void main (String[] args){
        Aula66ArquivoDAOImpl arquivoDAO = new Aula66ArquivoDAOImpl();
        Aula66DatabaseDAOImpl databaseDAO = new Aula66DatabaseDAOImpl();

        //Aula66ArquivoDAOImpl arquivoDAO2 = new Aula66DatabaseDAOImpl();
        //incompatible types:
        // estudo.javacore.N_polimorfismo.classes.Aula66DatabaseDAOImpl
        // cannot be converted to estudo.javacore.N_polimorfismo.classes.Aula66ArquivoDAOImpl

        Aula66GenericDAO arquivoDAO2 = new Aula66ArquivoDAOImpl();
        Aula66GenericDAO arquivoDAO3 = new Aula66DatabaseDAOImpl();

        arquivoDAO.save();

        databaseDAO.save();

        arquivoDAO2.save();

        arquivoDAO3.save();

    }
}
