package estudo.introducao.controlefluxo;

/**
*
* break
 * somente no while, do/while, for e swith
*/
public class Aula16ControleFluxoExercicio{
	public static void main(String[] args){
		//Imprima todos os numeros pares de 0 ate 100000
		
		int numeroPares = 0;

		for (numeroPares=0; numeroPares<=10000; ++numeroPares){
			if (numeroPares % 2 == 0){
				System.out.println("Pares de 0 ate 100k = " +numeroPares);
			}
			//while (numeroPares % 2 == 0){
			//	System.out.println("Pares de 0 ate 100k = " +numeroPares);
			//	numeroPares = numeroPares + 1;
			//}
		}

		int numPar = 0;

	}
}