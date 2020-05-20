package estudo.javacore.G_associacao.classes;

public class Aula48Seminario {
    private String titulo;
    private Aula48Aluno[] alunos;
    private Aula48Professor professor;
    private Aula48Local local;

    public Aula48Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Aula48Seminario() {
    }

    public void imprimir(){
        System.out.println(" ----- ");
        System.out.println(" ---- Relatorio Seminario ----- ");
        System.out.println("Titulo do seminario: "+this.titulo);
        System.out.println("Professor palestrante: "+this.professor.getNome());
        if ( this.local != null){
            System.out.println("Local. Rua - " +this.local.getRua()+ ". Bairro - " +this.local.getBairro());
        }else{
            System.out.println("Nenhum local cadastrado para esse seminário");
        }
        if (alunos != null && alunos.length !=0){
            System.out.println("Alunos participantes:");
            for (Aula48Aluno aluno : alunos){
                System.out.println(aluno.getNome());
            }
            return;
        }else{
            System.out.println("Nenhum aluno criado");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aula48Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aula48Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aula48Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Aula48Professor professor) {
        this.professor = professor;
    }

    public Aula48Local getLocal() {
        return local;
    }

    public void setLocal(Aula48Local local) {
        this.local = local;
    }
}
