package estudo.javacore.G_associacao.classes;

public class Aula48Professor {
    private String nome;
    private String especialidade;
    private Aula48Seminario[] seminarios;

    public Aula48Professor() {
    }

    public Aula48Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void imprimir(){
        System.out.println(" ----- ");
        System.out.println(" ---- Relatorio Professor ----- ");
        System.out.println("Nome Prof: "+this.nome);
        System.out.println("Especialidade Prof: "+this.especialidade);
        if (seminarios != null && seminarios.length !=0){
            System.out.println("Seminarios participantes");
            for (Aula48Seminario seminario : seminarios){
                System.out.println(seminario.getTitulo() + " ");
            }
            return;
        }else{
            System.out.println("Professor nao vinculado a nenhum seminario");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Aula48Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Aula48Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
