package estudo.javacore.C_sobrecargametodos.test;

import estudo.javacore.C_sobrecargametodos.classes.Aula38Funcionario;

public class Aula38FuncionarioTest {
    public static void main(String[] args) {

        Aula38Funcionario funcionario = new Aula38Funcionario("Teste");
        Aula38Funcionario funcionario2 = new Aula38Funcionario();
        //nome que se tornou obrigatorio por conta que o construtor solicitou

        //funcionario.setNome("Rodrigo Muniz");
        //funcionario.setCPF("12345678900");
        //funcionario.setSalario(1254);'

        funcionario.init("Renata Boa Viagem", "1234321111", 1234, "54321");

        funcionario.imprimir();
        funcionario2.imprimir();

    }
}
