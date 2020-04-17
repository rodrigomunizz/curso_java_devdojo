package estudo.introducao.arrays;

/*
*
*
**/
public class Aula20Arrays{
	public static void main(String[] args){
		int[] numeros1 = new int[5];
		float[] numeroFloat1 = new float[10];
		int[] numeros2 = {1,2,3,4,5}; // tamanho = 5, index = 0 ate 4;
		int[] numeros3 = new int[]{1,2,3,4,5}; // Não pode colocar o tamanho array no int[!]
		
		for(int i = 0 ; i < numeros2.length; i++){
			System.out.println(numeros2[i]);
		}
		
		System.out.println();

		// int aux; Não pode ser feito, se não da erro de compilação no codigo abaixo.

		//for each
		for(int aux : numeros3){
			System.out.println(aux);
		}
		// aux é só no nome


		System.out.println();
		
		String[] nomes = {"Juju", "Jao", "Muniz"};
		
		for(String aux : nomes){
			System.out.println(aux);
		}
		
	}
}