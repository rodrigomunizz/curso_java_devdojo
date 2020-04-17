package estudo.introducao.controlefluxo;

/**
*
* Java Completo - Aula 10: Controle de fluxo if, else if e else
*/
public class Aula10ControleFluxo{
	public static void main(String[] args){
		//if (false)
			//System.out.println("entrou no if");
			//System.out.println("Entra?");
		//O segundo sout sempre vai entrar, pq ele nao esta dentro do if. If sempre com {}, sem,  só pega a primeira instrução
		
		int idade = 20;
		float salario = 2000;
		boolean x = false;
		
		if (idade > 18){
			System.out.println ("Entrou no clube. Ele possui - " +idade+ " anos.");
		}
		
		if (x = true){
			System.out.println ("Entra. Pois um igual eh atribuicao.");
		}
		System.out.println (x);
		
		if (salario < 2000){
			System.out.println ("Salario menor que 2000");
		}else{
			System.out.println ("Salario maior que 2000");
		}
		
		if (idade < 15){
			System.out.println ("Menor que 15");
		} else if (idade >= 15 && idade < 18){
			System.out.println ("Entre 15 e menor que 18");
		} else {
			System.out.println ("Maior que 18");
		}
			
		
	}
}