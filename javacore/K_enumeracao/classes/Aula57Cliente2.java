package estudo.javacore.K_enumeracao.classes;

public class Aula57Cliente2 {
    private String nome;
    private Aula57TipoCliente tipoCliente;

    public Aula57Cliente2(String nome, Aula57TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Aula57Cliente2{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipoCliente +
                ", numero=" + tipoCliente.getTipo() +
                ", nome do estado=" + tipoCliente.getNome() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula57TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Aula57TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
