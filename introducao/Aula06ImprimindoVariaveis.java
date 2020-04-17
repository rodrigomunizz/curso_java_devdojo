package estudo.introducao;

/** Aula 06 - Continuação tipos primitivos, exercício e operadores
*
 * operadores unarios
 * ++ incremento
 * -- decremento
 * + soma
 * - menos
 * () cast
 * ! not
 * * multiplicação
 * / divisão
*/

public class Aula06ImprimindoVariaveis{
	public static void main(String[] args){
		int idade = 10;
		double salarioDouble = 3000;
		float salariFloat = 3000;
		byte idadeByte = 12;
		short idadeShort = 32767;
		boolean verdadeiro = true;
		boolean falso = false;
		long numeroGrande = 1000L;
		char caractere = '\u0041'; //2bytes

		String nome = "Muniz";
		//tipo não primitivo
		
		System.out.println("Dados impressos");
		System.out.println("idade = " +idade);

		System.out.println(falso);
		System.out.println(caractere);

	}
}
		