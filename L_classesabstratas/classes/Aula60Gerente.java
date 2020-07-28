package estudo.javacore.L_classesabstratas.classes;

public class Aula60Gerente extends Aula60Funcionario {
    //public Aula60Gerente() {
    //}

    public Aula60Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

   // @Override
  //  public void imprime() {

   // }

    @Override
    public void calculaSalario2(){
        this.salario = salario + (salario * 0.2);
    }
}
