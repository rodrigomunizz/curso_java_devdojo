package estudo.introducao.controlefluxo;

/**
* Java Completo - Aula 11: Controle de fluxo: Tabela verdade e mais.
*
*/
public class 	Aula11ControleFluxo{
	public static void main(String[] args){
		int idade = 20;
		String status;
		String statusDois;
		String statusTres;
		
		if (idade < 18){
			status = "Nao adulto";
		} else {
			status = "adulto";
		}
		
		//statusDois = idade < 18 ? <true> : <false> ;
		statusDois = idade < 18 ? "Não Aduto" : "Adulto" ;
		
		System.out.println(status);
		System.out.println(statusDois);
		
		statusTres = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto" ;
		System.out.println(statusTres);

		
	}
}
