package estudo.javacore.N_polimorfismo.classes;

import java.sql.SQLOutput;

public class Aula66DatabaseDAOImpl implements Aula66GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados no banco");
    }
}
