package estudo.introducao;

/** Aula 05 - Tipos primitivos, convenções de código e comentários
*
* CamelCase - Cada letra maiscula
*
* Tipos primitivos - int, double, boolean, char, byte, short, long
*/

/*
Comentario de mais de uma linha
*/

// comentario de uma unica linha

/***
 * Convenção de codigo - Aula05
 * Aula 05: Tipos primitivos, convenções de código e comentários
 */

/*
Comentario de mais de uma linha

Palavra composta na classe - sempre com letra maiscula, cada palavra

Para criar um programa precisa de uma classe e um medoto estatico (public static void main)

o "main" é o ponto de partida

args - parametro de entrada do metodo main
 */

// int - double - float - boolean - char - byte - short - long

public class Aula05ImprimindoVariaveis{
	//Camelcase
	public static void main(String[] args){
		//classe e metodo static
		//main é o ponto de entrada para executar o programa
		int idade = 10;
		// não usar palavras reservadas do java
		// somente primeira palavra com letra minuscula - "idadeDosPais"
		System.out.println("Dados impressos");
		System.out.println("idade = " +idade);
		// sinal de + é um concatenador

		System.out.println(3+5);
		//imprime soma direto

		System.out.println("3+5");
		//imprime a escrita

	}
}
		