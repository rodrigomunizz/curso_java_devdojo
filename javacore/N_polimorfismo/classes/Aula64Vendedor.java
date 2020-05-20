package estudo.javacore.N_polimorfismo.classes;

public class Aula64Vendedor extends Aula64Funcionario {

    public double totalVendas;

    public Aula64Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (this.totalVendas *0.05);
    }
}
