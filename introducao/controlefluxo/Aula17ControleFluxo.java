package estudo.introducao.controlefluxo;

/*
*/
public class Aula17ControleFluxo{
	public static void main (String[] args){
		// descubra quantas parcelas pode ser parcelado um carro, com valores da parcela >= 1000
		
		double valorTotal = 30000;
		double valorTotal2 = 30000;
		double valorParcela = 0;
		double valorParcela2 = 0;
		
		for (int parcela =1; parcela <= valorTotal; parcela++){
			valorParcela = valorTotal / parcela;
			if (valorParcela >= 1000){
				System.out.println ("Parcela " +parcela+ " para o valor de R$" +valorParcela);
			}else{
				System.out.println("saindo do laço");
				break;
			}
			// Codigo que seria executado dentro do for
			//System.out.println ("fora do if, sera executado em cada acao");
		}
		//for (int parcela2 = 1 ; parcela2 <= valorTotal2; parcela2++){
		//	valorParcela2 = valorTotal / parcela;
		//	if (valorParcela2 < 1000){
		//		break;
		//	}
		//	System.out.println ("Parcela " +parcela2+ "para o valor de R$" +valorParcela2);
		//}

		System.out.println("---");

		for (int parcela2 = (int)valorTotal2 ; parcela2 >= 1 ; parcela2--){
			valorParcela2 = valorTotal2 / parcela2;
			if (valorParcela2 <= 1000){
				continue; // retorna no for
			}
			System.out.println ("Parcela " +parcela2+ " para o valor de R$ " +valorParcela2);
		}
	
	}
}