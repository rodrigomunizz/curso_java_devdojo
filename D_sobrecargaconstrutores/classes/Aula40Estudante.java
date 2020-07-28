package estudo.javacore.D_sobrecargaconstrutores.classes;

//

public class Aula40Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;


    public Aula40Estudante() {
        System.out.println("Default");
    }

    // se for colocado um public void Aula40Estudante não sera um construtor padrão e vai dar erro de compilação.
    //construtores não tem retorno, nem void (vazio)
    public Aula40Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Aula40Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas); //esse chama o construtor acima
        //this() --> chamada de um outro construtor - da maneira que esta chama o padrão
        //this.matricula = matricula;
        //contrutores nao podem ser chamados em metodos
        //this.nome = nome;
        //this.notas = notas;

        this.dataMatricula = dataMatricula;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
        System.out.println((this.dataMatricula));

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
