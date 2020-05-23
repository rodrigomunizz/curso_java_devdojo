package estudo.javacore.N_polimorfismo.classes;

public class Aula66ArquivoDAOImpl implements Aula66GenericDAO{

    @Override
    public void save() {
        System.out.println("Salvando dados no arquivo");
    }
}
