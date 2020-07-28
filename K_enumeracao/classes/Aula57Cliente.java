package estudo.javacore.K_enumeracao.classes;

public class Aula57Cliente {
    private String nome;
    private int tipo;
    private TipoPagamento tipoPagamento;

    public enum TipoPagamento{
        //tudo é considerado constante
        // não é permitido criar enum dentro de metodo
        A_VISTA,A_PRAZO,
    }

    @Override
    public String toString() {
        return "Aula57Cliente...{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", tipoPagamento=" + tipoPagamento +
                ", tipo=}";
    }

    public Aula57Cliente(String nome, int tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
