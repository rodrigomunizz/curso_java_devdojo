package estudo.javacore.K_enumeracao.classes;

public enum Aula57TipoCliente {
    //tudo é considerado constante
    // as constantes da enum devem ser na primeira linha
    PESSOA_FISICA(1, "Pessoa Fisica"){public String getId(){
        return "B";
        //corpo de classe específico constante
        //constant specific class body
    }},PESSOA_JURIDICA(2, "Pessoa Juridica"),;

    private int tipo;
    private String nome;

    //não pode criar um construtor public - pq nunca iremos chamar
    //construtores sempre são privados no enum

    Aula57TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getId(){
        return "A";
    }
}
//eum nao é permitido dentro de um medodo
