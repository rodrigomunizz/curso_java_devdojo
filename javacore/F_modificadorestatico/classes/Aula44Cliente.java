package estudo.javacore.F_modificadorestatico.classes;

// 1 - bloco de inicialização estatico é executado quando carregado a classe
// 2 - alocado espaco na memorio para o objeto que sera criado
// 3 - cada atributo de classe é criado e inicializado com seus valores default ou o valor explicito
// 4 - bloco de inicialização é executado
// 5 - o construtor é executado

public class Aula44Cliente {
    //private int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    private static int[] parcelas;

    {
        System.out.println("dentro do bloco de inicialização - 1");
    }

    static{
        System.out.println("dentro do bloco de inicialização - estatico - 1");
        parcelas = new int[100];
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    static{
        System.out.println("dentro do bloco de inicialização - estatico - 2");
    }

//    public Aula44Cliente() {
//        for (int parcela : this.parcelas) {
//          System.out.print(parcela + " ");
//        }
//        System.out.println("dentro do construtor");
//    }

    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        Aula44Cliente.parcelas = parcelas;
    }
    //   {
//        System.out.println("dentro do bloco de inicializacao");
//    }

}
