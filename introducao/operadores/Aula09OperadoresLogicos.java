package estudo.introducao.operadores;

/** Comentário
*
 * Java Completo - Aula 09: Operadores de Atribuição
 *
*/
public class Aula09OperadoresLogicos{
	public static void main(String[] args){
		// =, -=, +=, *=, /=, %=
		// atribuições
		// numero = numero ~ 1000
		// numero ~= 1000

		double salario = 2000;

		//

		//salario += 1000;

		//salario = salario + 1000;

		//salario recebe salario mais 1000;

		//salario -= 800;

		//salario = salario - 800;

		//salario recebe salario menos 800;

		//

		salario *= 0.1 + (salario);
		// salario = salario * (0.1 +(salario));

		//salario = salario + (int)(salario * 0.1);
		// (int) para forçar ser inteiro. Pq * por 0.1 é um double
		
		
		System.out.println(salario);
		// 1800 + 1000 - 800 = 2000. 2000 + 200 = 2200.
		
		
	}
	}