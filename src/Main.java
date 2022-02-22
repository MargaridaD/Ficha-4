import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Fruta> frutas = new ArrayList<Fruta>();
		
		
		FrutaUnidade maca1un = new FrutaUnidade("1un_maca", 0.5, 1);
		FrutaUnidade maca10un = new FrutaUnidade("1un_maca", 0.5, 10);
		FrutaPeso maca1kg = new FrutaPeso("1kg_maca", 1.4, 1);
		FrutaPeso maca2kg = new FrutaPeso("2kg_maca", 1.4, 2);
		FrutaVolume maca1lt = new FrutaVolume("1lt_maca", 1.3, 1);
		FrutaVolume maca5lt = new FrutaVolume("5lt_maca", 1.3, 5);
		
		frutas.add(maca1un);
		frutas.add(maca10un);
		frutas.add(maca1kg);
		frutas.add(maca2kg);
		frutas.add(maca1lt);
		frutas.add(maca5lt);
		
		
		for(Fruta i:frutas) {
			String valorPagarFormatado= new DecimalFormat("#,##0.00").format(i.pagar());
			System.out.println("Nome: " + i.getNome() + " *** Preço: " + valorPagarFormatado +" €");
		}		
		
	}

}
