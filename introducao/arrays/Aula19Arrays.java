package estudo.introducao.arrays;

/*
*/



public class Aula19Arrays{
	public static void main(String[] args){

		// valores preenchidos inicial
		// byte, short, int, long, float, double = 0
		// char = '\u0000' = " "
		// boolean = false.
		// reference = null

		String[] nomes = new String[3];
		
		nomes[0] = "Naruto";
		nomes[1] = "Goku";
		nomes[2] = "Rodrigo";
		
		//Tamanho do array = nomes.length
		System.out.println(nomes.length);
		
		for (int i=0 ; i < nomes.length ; i++){
			System.out.println(nomes[i]);
		}
		
		nomes = new String[4];
		// perde a referencia
		System.out.println(nomes[0]);
	}

}