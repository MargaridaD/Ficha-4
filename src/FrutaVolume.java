
public class FrutaVolume extends Fruta implements IDescontavel {
	private float volume;
	private float percentagemDesconto; 

	public FrutaVolume (String aNome, double aPrecoBase, float aVolume) {
		super(aNome, aPrecoBase);
		volume= aVolume;
		percentagemDesconto = 0;		//por defeito, não é atribuido desconto
	}

	public double pagar() {
		return volume*getPrecoBase()-descontar();
	}

	

	@Override
	public double descontar() {
		return volume*getPrecoBase()*percentagemDesconto;
	}
	
	//Getters e Setters
	public double getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public void setPercentagemDesconto(float percentagemDesconto) {
		this.percentagemDesconto = percentagemDesconto;
	}
	
	
	
	
}
