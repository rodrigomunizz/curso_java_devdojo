package estudo.javacore.P_assertions.test;

public class Aula77AssertTest {
    public static void main (String[] args){
        //calculaSalario(-2000);
        calcSalario(-1000);
        diasDaSemana(8);
    }

    private static void calculaSalario(double salario){
        //fazer calculo com salario
        assert (salario > 0): "Pode colocar msg"; // se meu salario for menor que zero, tem algo muito errado
        //as boas regras dizem pra usar com metodo privado.
    }

    public static void calcSalario(double salario){
        if(salario<0){
            throw new IllegalArgumentException();
        }
    }

    public static void diasDaSemana(int dia){
        switch (dia){
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default: assert false;


        }

    }
}
