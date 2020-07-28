package estudo.javacore.B_introducaometodos.classes;

// java Completo - Aula 31: Métodos com parâmetros tipo reference pt 01
// Java Completo - Aula 32: Passagem de objeto como parâmetro e this pt 02

public class Aula31Professor {
    public String nome;
    public String matricula;
    public String RG;
    public String CPF;

    public void imprime (Aula31Professor refe){
        System.out.println(refe.CPF);
        System.out.println(refe.RG);
        System.out.println(refe.nome);
        System.out.println(refe.matricula);
        refe.nome = "Nome alterado dentro do imprime";
        System.out.println(refe.nome);

    }

    public void imprimeNovo (){
        System.out.println(this.CPF);
        System.out.println(this.RG);
        System.out.println(this.nome);
        System.out.println(this.matricula);

    }
}
