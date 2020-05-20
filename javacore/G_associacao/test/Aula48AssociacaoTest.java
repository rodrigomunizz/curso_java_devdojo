package estudo.javacore.G_associacao.test;

import estudo.javacore.G_associacao.classes.Aula48Aluno;
import estudo.javacore.G_associacao.classes.Aula48Local;
import estudo.javacore.G_associacao.classes.Aula48Professor;
import estudo.javacore.G_associacao.classes.Aula48Seminario;

public class Aula48AssociacaoTest {
    public static void main (String[] args){
        Aula48Aluno aluno = new Aula48Aluno("Rodrigo Muniz", 35);
        Aula48Aluno aluno2 = new Aula48Aluno("Renata BV", 36);

        Aula48Seminario seminario = new Aula48Seminario("Curso Java.");
        Aula48Seminario seminario2 = new Aula48Seminario("Curso Psicologia.");

        Aula48Professor professor = new Aula48Professor("Yoda", "Usar a força");
        Aula48Professor professor2 = new Aula48Professor("Freud", "Louco por natureza");

        Aula48Local local = new Aula48Local("Rua das baratas", "Baratatopolis");
        Aula48Local local2 = new Aula48Local("Rua das bonecas", "Bonecopolispolis");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario2);
        //aluno.imprimir();

        seminario.setProfessor(professor);
        seminario2.setProfessor(professor2);
        seminario.setLocal(local);
        seminario2.setLocal(local2);
        seminario.setAlunos(new Aula48Aluno[]{aluno});
        seminario2.setAlunos(new Aula48Aluno[]{aluno2});

        Aula48Seminario[] semArray = new Aula48Seminario[1];
        semArray[0] = seminario;
        professor.setSeminarios(semArray);

        Aula48Seminario[] semArray2 = new Aula48Seminario[1];
        semArray2[0] = seminario2;
        professor2.setSeminarios(semArray2);

        seminario.imprimir();
        professor.imprimir();
        aluno.imprimir();
        aluno2.imprimir();
        local.imprimir();

        seminario2.imprimir();
        professor2.imprimir();
        local2.imprimir();

    }
}
