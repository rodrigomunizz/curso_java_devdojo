package estudo.javacore.H_heranca.classes;

//public - private - protected

public class Aula50Pessoa extends Object { // toda classe é filha de object
    protected String nome;
    protected String cpf;
    protected Aula50Endereco endereco;

    public Aula50Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização pessoa 2");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Aula50Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Aula50Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco);
        System.out.println(this.endereco.getRua());
        System.out.println(this.endereco.getBairro());
    }
}
