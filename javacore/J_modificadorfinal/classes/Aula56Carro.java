package estudo.javacore.J_modificadorfinal.classes;

public class Aula56Carro {
    //final na class - não permite extensão
    public static final double VELOCIDADE_FIVAL = 250;
    private final Aula56Comprador comprador = new Aula56Comprador();
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Aula56Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Aula56Comprador getComprador() {
        return comprador;
    }

    public static double getVelocidadeFival() {
        return VELOCIDADE_FIVAL;
    }

    public final void imprime(){
        System.out.println("imprimindo carro");
    }

//    public void setVelocidadeFinal(double VELOCIDADE_FIVAL) {
//        this.VELOCIDADE_FIVAL = VELOCIDADE_FIVAL;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
