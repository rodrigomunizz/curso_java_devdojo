package estudo.javacore.L_classesabstratas.classes;

public class Aula60Vendedor extends Aula60Funcionario{
    private double totalVendas;

    @Override
    public void imprime() {

    }

    public Aula60Vendedor(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Aula60Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    public Aula60Vendedor() {
    }

    public Aula60Vendedor(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario2(){
        this.salario = salario + (this.totalVendas * 0.05);
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }



}
