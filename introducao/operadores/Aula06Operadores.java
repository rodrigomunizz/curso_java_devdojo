package estudo.introducao.operadores;

/** Aula 06 - Operadores
 *
 * operadores unarios
 * ++ incremento
 * -- decremento
 * + soma
 * - menos
 * * multiplicação
 * / divisão
 * () cast
 * ! not
 */

public class Aula06Operadores{
	public static void main(String[] args){
		int numero1 = 10;
		int numero2 = 20;
		int soma = numero1+numero2;
		
		System.out.println ("numero1+numero2 : ");
		System.out.println (numero1+numero2);
		System.out.println (numero1+numero2 + " Texto após os numeros");
		System.out.println (" Texto antes do numero1+numero2 = " +numero1+numero2);
		System.out.println (" Texto antes do numero1+numero2 e o mesmo entre () = " +(numero1+numero2));
		System.out.println ("soma + numeros 1 e 2 : " +(soma+numero1+numero2));
	}
}