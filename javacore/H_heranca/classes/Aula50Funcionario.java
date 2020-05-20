package estudo.javacore.H_heranca.classes;

//não existe herança multipla em java

public class Aula50Funcionario extends Aula50Pessoa {
    private double salario;

    public Aula50Funcionario (String nome){
        super(nome);
        System.out.println("Dentro do construtor funcionario.");
    } // super não pode utilizar ponto (.)
    // tem que ser o primeiro
    // nao pode ter super e this

    static {
        System.out.println("Dentro do bloco de inicialização estatico fornecedor");
    }

    {
        System.out.println("Dentro do bloco de inicialização fornecedor 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização fornecedor 2");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
        this.imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println ("Eu " +super.nome+ " recebi o pagamento na quantia de " +this.salario+".");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
