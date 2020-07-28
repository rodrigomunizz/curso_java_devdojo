package estudo.javacore.L_classesabstratas.classes;

public abstract class Aula61Pessoa {
    protected String nome;

    public abstract void imprime();

    public String getNome() {
        return nome;
    } //metodo concreto. codigo entre as chaves

    public void setNome(String nome) {
        this.nome = nome;
    }
}
