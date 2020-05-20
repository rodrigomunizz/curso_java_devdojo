package estudo.javacore.J_modificadorfinal.classes;

public class Aula56Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Aula56Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
