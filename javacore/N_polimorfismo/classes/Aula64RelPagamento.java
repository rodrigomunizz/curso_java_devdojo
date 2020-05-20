package estudo.javacore.N_polimorfismo.classes;

public class Aula64RelPagamento {

//    public void relPagamentoGerente (Aula64Gerente gerente){
//        System.out.println("Gerando relatorio de pagamento de Gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: " +gerente.nome);
//        System.out.println("Salario: " +gerente.getSalario());
//    }
//
//    public void relPagamentoVendedor (Aula64Vendedor vendedor){
//        System.out.println("Gerando relatorio de pagamento de Vendedor");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: " +vendedor.getNome());
//        System.out.println("Salario: " +vendedor.salario);
//    }

    public void relPagamentoGeral (Aula64Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " +funcionario.getNome());
        System.out.println("Salario: " +funcionario.salario);
        if (funcionario instanceof Aula64Gerente){
            Aula64Gerente ger = (Aula64Gerente) funcionario;
            System.out.println("Participação dos Luros: " +ger.getParticipacaoLucro());
        }
        if (funcionario instanceof Aula64Vendedor){
            //Aula64Vendedor ver = (Aula64Vendedor) funcionario;
            System.out.println("Total de Vendas: " +((Aula64Vendedor) funcionario).getTotalVendas());
        }
    }
}
