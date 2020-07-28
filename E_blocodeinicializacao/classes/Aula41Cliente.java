package estudo.javacore.E_blocodeinicializacao.classes;

// 1 - alocado espaco na memorio para o objeto que sera criado
// 2 - cada atributo de classe é criado e inicializado com seus valores default ou o valor explicito
// 3 - bloco de inicialização é executado
// 4 - o construtor é executado

public class Aula41Cliente {
    //private int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    private int[] parcelas;

    {
        System.out.println("dentro do construtor");
        parcelas = new int[100];
        for (int i=1; i<=100; i++){
            parcelas[i-1] = i;
        }
    }

    public Aula41Cliente(){
        for (int parcela : this.parcelas){
            System.out.print(parcela + " ");
        }
        System.out.println("dentro do construtor");
    }

    public int[] getParcelas(){
        return parcelas;
    }

    public void setParcelas(int[] parcelas){
        this.parcelas = parcelas;
    }
    //   {
//        System.out.println("dentro do bloco de inicializacao");
//    }


}
