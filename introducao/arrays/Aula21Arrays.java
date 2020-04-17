package estudo.introducao.arrays;

/**
* Aula 21: Arrays parte 4 arrays multidimensionais
**/
public class Aula21Arrays{
	public static void main(String[] args){
		int[][] dias = new int[2][2];
		// o Java só exige o array original
		
		dias[0][0] = 30;
		dias[0][1] = 31;
		dias[1][0] = 28;
		dias[1][1] = 29;
		
		for (int i = 0; i < dias.length; i++){
			System.out.println("A = " +dias[i]);
			//int y = dias[i].length;
			//System.out.println("B = " +y);
			for (int j = 0; j < dias[i].length; j++){
				System.out.println("C "+i+j+" = " +dias[i][j]);
			}
		}
		
		System.out.println("----");

		int x = dias.length;
		int y = dias[1].length;

		System.out.println(x);
		System.out.println(y);

		System.out.println("----");

		for(int[] ref : dias){
			for(int dia : ref){
				System.out.println(dia);
			}
		}
		
	}
}