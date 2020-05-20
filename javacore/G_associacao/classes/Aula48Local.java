package estudo.javacore.G_associacao.classes;

public class Aula48Local {
    private String rua;
    private String bairro;

    public Aula48Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Aula48Local() {
    }

    public void imprimir(){
        System.out.println(" ----- ");
        System.out.println(" ---- Relatorio Local ----- ");
        System.out.println("Rua: " +this.rua);
        System.out.println("Bairro: " +this.bairro);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
