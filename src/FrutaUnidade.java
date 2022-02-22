
public class FrutaUnidade extends Fruta{
	private int quantidade;

	public FrutaUnidade(String aNome, double aPrecoBase, int aQuantidade) {
		super(aNome, aPrecoBase);
		quantidade= aQuantidade;
	}

	public double pagar() {
		return quantidade*getPrecoBase();
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
