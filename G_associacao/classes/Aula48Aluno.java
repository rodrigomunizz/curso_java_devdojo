package estudo.javacore.G_associacao.classes;

public class Aula48Aluno {
    private String nome;
    private int idade;
    private Aula48Seminario seminario;

    public Aula48Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aula48Aluno() {
    }

    public void imprimir(){
        System.out.println(" ----- ");
        System.out.println(" ---- Relatorio Aluno ----- ");
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        if(this.seminario != null){
            System.out.println("Seminário Alocado: " +this.seminario.getTitulo());
        }else{
            System.out.println("Seminário Alocado: Nenhum" );
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Aula48Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Aula48Seminario seminario) {
        this.seminario = seminario;
    }
}
