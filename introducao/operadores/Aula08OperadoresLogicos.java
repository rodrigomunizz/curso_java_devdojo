package estudo.introducao.operadores;

// Java Completo - Aula 08: Operadores Lógicos

/** Comentário
*
 * && - AND
 * || - OU
*/

public class Aula08OperadoresLogicos{
	public static void main(String[] args){
		int idade = 18;
		float salario = 1000f;
		
		System.out.println (idade >= 18 && salario >= 1000);
		// retorna true
		
		System.out.println (idade >= 18 && salario >= 3000);
		// retorna false - salario não é maior de 3000
		
		System.out.println (idade >= 18 || salario >= 1000);
		// retorna true
		
		System.out.println (idade >= 18 || salario >= 3000);
		// retorna true
		
		System.out.println (idade < 18 || salario >= 3000);
		// retorna false - idadé é maior que 18 e salario menor que 3000
	}
}