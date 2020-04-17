package estudo.introducao.controlefluxo;

/**
 *
 * Java Completo - Aula 12: Controle de fluxo Resolução do exercício if else
 *
 *
* Variavel salario
* Imposto :
* Salario menos 1000 - 5% 
* salario maior igual 1000 e menor que 2000 - 10%
* salario maior igual 2000 e menor que 4000 - 15%
* salario maior igual 4000 - 20%
*/

public class Aula11ExercicioControleFluxo{
		public static void main (String[] args){
			double salario = 0;
			
			double imposto = 0;
			double newSalario =0;
			
			
			if (salario < 1000 ){
				imposto = 5;
			}else if (salario >= 1000 && salario < 2000){
				imposto = 10;
			}else if (salario >= 2000 && salario < 4000){
				imposto = 15;
			}else{
				imposto = 20;
			}

			newSalario = salario - (salario * (imposto/100));

			System.out.println ("Salario inicial de = " +salario+ ".");
			System.out.println ("Imposto de = " +imposto+ "%.");
			System.out.println ("Novo salario = " +newSalario+ ".");
		}
}