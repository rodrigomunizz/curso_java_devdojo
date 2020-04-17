package estudo.introducao.controlefluxo;

/**
* Java Completo - Aula 13: Controle de fluxo switch e exercícios
 *
* Tipos que podem ir dentro do  switch
 * char , int, byte, short, enum e String
 *
 * float e double - não podem.
*/

public class Aula13ControleFluxo{
	public static void main(String[] args){
		byte dia = 5;
		switch (dia){
			case 1:
				System.out.println("Dom");
				break;
			case 2:
				System.out.println("Seg");
				break;
			case 3:
				System.out.println("Ter");
				break;
			case 4:
				System.out.println("Qua");
				break;
			case 5:
				System.out.println("Qui");
				break;
			case 6:
				System.out.println("Sex");
				break;
			case 7:
				System.out.println("Sab");
				break;
		}
	
		char sexo = 'F';
		switch (sexo){
			case 'F': 
				System.out.println ("Feminino");
				break;
			case 'M':
				System.out.println ("Masculino");
		}	
		String sexo2 = "N";
		switch (sexo2){
			default:
				System.out.println ("Teste");
				break;
			case "F":
				System.out.println ("Feminino");
				break;
			case "M":
				System.out.println ("Masculino");
		}		
	}
}