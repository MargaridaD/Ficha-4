import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
	
		FrutaUnidade maca1un = new FrutaUnidade("1un_maca", 0.5, 1);
		FrutaUnidade maca10un = new FrutaUnidade("10un_maca", 0.5, 10);
		FrutaPeso maca1kg = new FrutaPeso("1kg_maca", 1.4, 1);
		FrutaPeso maca2kg = new FrutaPeso("2kg_maca", 1.4, 2);
		FrutaPeso pera1kg = new FrutaPeso("1kg_pera", 1.5, 1);
		FrutaPeso pera8kg = new FrutaPeso("8kg_pera", 1.5, 8);
		FrutaVolume maca1lt = new FrutaVolume("1lt_maca", 1.3, 1);
		FrutaVolume maca5lt = new FrutaVolume("5lt_maca", 1.3, 5);
		FrutaVolume banana3lt = new FrutaVolume("3lt_banana", 0.9, 3);
		
		Cesto cesto1 = new Cesto();
		
		cesto1.inserirCesto(maca1un);
		cesto1.inserirCesto(maca10un);
		cesto1.inserirCesto(pera1kg);
		cesto1.inserirCesto(pera8kg);
		cesto1.inserirCesto(maca1kg);
		cesto1.inserirCesto(maca2kg);
		cesto1.inserirCesto(maca1lt);
		cesto1.inserirCesto(maca5lt);
		cesto1.inserirCesto(banana3lt);

		//Imprimir informação sobre cada fruta
		for(Fruta i:cesto1.getFrutas()) {
			String valorPagarFormatado= new DecimalFormat("#,##0.00").format(i.pagar());
			System.out.println("Nome: " + i.getNome() + " --> Preço: " + valorPagarFormatado +" €");
		}		
		
		//Valor total do cesto:
		double valorCesto = cesto1.valorCesto();
		String valorCestoFormatado= new DecimalFormat("#,##0.00").format(valorCesto);
		
		//Numero de frutas de cada tipo dentro do cesto
		int numeroFrutaUnidade = cesto1.numeroFrutaPorTipo("FrutaUnidade");
		int numeroFrutaPeso = cesto1.numeroFrutaPorTipo("FrutaPeso");
		int numeroFrutaVolume = cesto1.numeroFrutaPorTipo("FrutaVolume");

		System.out.println("\nValor do cesto: " + valorCestoFormatado +" €"
				+ "\n\n* * * Número de frutas de cada tipo dentro do cesto * * * "
				+ "\nFruta à unidade: " + numeroFrutaUnidade + " unidades,"
				+ "\nFruta ao peso: " + numeroFrutaPeso + " unidades,"
				+ "\nFruta a volume: " + numeroFrutaVolume + " unidades"
				);
		
		//Atribuir um desconto de 25% a 5lt_maca e 20% a 8kg_pera
		maca5lt.setPercentagemDesconto(0.25f);
		pera8kg.setPercentagemDesconto(0.20f);
		
		//Imprimir informação sobre cada fruta
		for(Fruta i:cesto1.getFrutas()) {
			String valorPagarFormatado= new DecimalFormat("#,##0.00").format(i.pagar());
			System.out.println("Nome: " + i.getNome() + " --> Preço: " + valorPagarFormatado +" €");
		}
		
		

		
	}

}
