package estudo.introducao.arrays;

/**
* Aula 22: Arrays parte 5 arrays multidimencionais
**/
public class Aula22Arrays{
	public static void main(String[] args){
		
		//formas para inicializar um array
		//int[] arrInt = {1,2,3};
		//int[] arrInt2 = new int [3];
		//int[] arrInt3 = new int[] {1,2,3};
		
		int [][] dias = new int [3][];
		
		dias [0] = new int [2];
		dias [1] = new int [] {1,2,3};
		dias [2] = new int [4];
		
		for (int[] arr : dias){
			for (int num : arr){
				System.out.println(num);
			}
		}

		System.out.println("------------------------");

		int[][] dias2 = {{0,0},{1,2,3},{0,0,0,0}};

		System.out.println (dias2[1][0]);
		
	}

}