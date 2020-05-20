package estudo.javacore.L_classesabstratas.test;

import estudo.javacore.L_classesabstratas.classes.Aula60Funcionario;
import estudo.javacore.L_classesabstratas.classes.Aula60Gerente;
import estudo.javacore.L_classesabstratas.classes.Aula60Vendedor;

public class Aula60FuncionarioTest {
    public static void main(String[] args) {
        //Aula60Funcionario func = new Aula60Funcionario("Rodrigo", "123456-2", 2000);

        Aula60Gerente geren = new Aula60Gerente("Renata", "654321-1", 3000);

        Aula60Vendedor vend = new Aula60Vendedor("Rodrigo", "123456-2", 3000, 5000);

        //func.calculaSalario();
        geren.calculaSalario2();
        vend.calculaSalario2();

        System.out.println(vend.toString());
        System.out.println(geren.toString());

    }
}
