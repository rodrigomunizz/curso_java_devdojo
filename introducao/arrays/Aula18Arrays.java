package estudo.introducao.arrays;

/*
*/

// size = index + 1;

public class Aula18Arrays{
	public static void main(String[] args){
		int[] idades = new int[3]; // array é um objeto
		//int idades[];
		
		idades[0] = 20;
		idades[1] = 15;
		idades[2] = 30;
		//idades[posição] = valor;

		//tamanho = 3
		//index = 2

		//idades[3] = 45;
		// vai dar erro em tempo de execução, pois esta passando das posições.
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3

		System.out.println("idade 1: " +idades[0]);
		System.out.println("idade 2: " +idades[1]);
		System.out.println("idade 3: " +idades[2]);
	}
}