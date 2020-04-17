package estudo.javacore.F_modificadorestatico.classes;

// operador estatico - atributo especifico da classe e não do objeto

public class Aula42Carro {
    //velocidade maxima deve ser de 240km
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240; // operador estatico

    public Aula42Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Aula42Carro() {

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //   public void setVelocidadeLimite(double velocidadeLimite){
    //       this.velocidadeLimite = velocidadeLimite;
    //   }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Aula42Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void imprimir() {
        System.out.println("-----------------------------");
        System.out.println(this.nome);
        System.out.println("VM: " + this.velocidadeMaxima);
        System.out.println("VL: " + velocidadeLimite); // não precisa do this, pq é um atributo static da classe
    }

}
