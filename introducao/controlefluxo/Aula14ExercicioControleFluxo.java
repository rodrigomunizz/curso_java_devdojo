package estudo.introducao.controlefluxo;

/**
*
*
*/
public class Aula14ExercicioControleFluxo{
	public static void main(String[] args){
		byte dia = 8;
		
		switch (dia){
			case 1	:case 7:
				System.out.println("Final De Semana");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Dia util");
				break;
			default:
				System.out.println("Opcao Invalida");
				break;			
		}
	}
}