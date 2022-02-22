
public class FrutaPeso extends Fruta {
	private double peso;

	public FrutaPeso (String aNome, double aPrecoBase, double aPeso) {
		super(aNome, aPrecoBase);
		peso= aPeso;
	}


	public double pagar() {
		
		return peso*getPrecoBase();
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
