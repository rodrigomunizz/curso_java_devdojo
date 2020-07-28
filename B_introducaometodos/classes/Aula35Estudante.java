package estudo.javacore.B_introducaometodos.classes;

//  Java Completo - Aula 35: Exercício sobre métodos

public class Aula35Estudante {
    private String nomeAluno;
    private int idades;
    private double[] notas;
    public int teste;
    private boolean aprovado;

    public void imprimir() {
        System.out.println("Nome - Aluno: " + this.nomeAluno);
        if (this.idades <= 0) {
            System.out.println("Idade é menor que zero. Verificar aviso anterior");
        } else {
            System.out.println("Idade: " + this.idades);
        }

        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.print(nota + " ; ");
            }
        }
    }

    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("Esse aluno no possui notas.");
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media = media + nota;
        }
        media = media / this.notas.length;

        if (media > 6) {
            this.aprovado = true;
            System.out.println("\nA media é: " + media + ". Situacao - Aprovado.");
        } else {
            this.aprovado = false;
            System.out.println("\nA media é: " + media + ". Situacao - Reprovado.");
        }
    }

    // getters and setters

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setIdades(int idades) {
        if (idades < 0) {
            System.out.println("Nao colocar idade menor que zero");
            return;
        }
        this.idades = idades;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNomeAluno() {
        return this.nomeAluno;
    }

    public int getIdades() {
        return this.idades;
    }

    public double[] getNotas() {
        return this.notas;
    }

    //não precisa - para não ter alteração de variavel
    //public void setAprovado (boolean aprovado){
    //    this.aprovado = aprovado;
    //}

    public boolean isAprovado(){
        return this.aprovado;
    }

}