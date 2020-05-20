package estudo.javacore.N_polimorfismo.classes;

public class Aula64Gerente extends Aula64Funcionario {

    private double participacaoLucro;

    public Aula64Gerente(String nome, double salario, double participacaoLucro) {
        super(nome, salario);
        this.participacaoLucro = participacaoLucro;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + this.participacaoLucro;
    }

    public double getParticipacaoLucro() {
        return participacaoLucro;
    }

    public void setParticipacaoLucro(double participacaoLucro) {
        this.participacaoLucro = participacaoLucro;
    }
}
