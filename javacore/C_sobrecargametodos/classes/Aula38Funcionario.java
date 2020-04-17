//sobrecarga tem que manter o mesmo nome, e so mudar a quantidade e o tipo de parametro.
// double cabe int. int cabe dentro do double

// construtor não tem retorno. nunca terá.
// construtor sempre será criado - se vc nao criar.

package estudo.javacore.C_sobrecargametodos.classes;

public class Aula38Funcionario {
    private String nome;
    private String CPF;
    private double salario;
    private String rg;

    public Aula38Funcionario(String nome) {
        //System.out.println("Dentro do construtor");
        this.nome = nome;
    }

    public Aula38Funcionario(){

    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() { return this.nome; }

    public String getCPF() {
        return this.CPF;
    }

    public double getSalario() {
        return this.salario;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.CPF);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

    public void init(String nome, String CPF, double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }

    public void init(String nome, String CPF, double salario, String rg) {
        init(nome, CPF, salario);
        //this.nome = nome;
        //this.CPF = CPF;
        //this.salario = salario;
        this.rg = rg;
    }

}
