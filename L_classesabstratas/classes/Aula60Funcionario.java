package estudo.javacore.L_classesabstratas.classes;

public abstract class Aula60Funcionario extends Aula61Pessoa{
    //abstract so serve para ser extendida. não pode ser estanciada
    //private String nome;
    private String clt;
    protected double salario;

    @Override
    public void imprime() {

    }

    public Aula60Funcionario() {
    }

    public Aula60Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Aula60Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void calculaSalario(){
        this.salario = salario + (salario * 0.1);
    }

    public abstract void calculaSalario2(); // metrodo abastrato, nao possui corpo.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
