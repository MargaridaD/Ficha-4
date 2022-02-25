
public class FrutaPeso extends Fruta implements IDescontavel{
	private float peso;
	private float percentagemDesconto; 
	

	public FrutaPeso (String aNome, double aPrecoBase, float aPeso) {
		super(aNome, aPrecoBase);
		peso= aPeso;
		percentagemDesconto = 0;		//por defeito, não é atribuido desconto
	}


	public double pagar() {
		
		return peso*getPrecoBase()-descontar();
	}

	@Override
	public double descontar() {
		return peso*getPrecoBase()*percentagemDesconto;
	}
	
	
	//Getters e Setters
	public double getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public void setPercentagemDesconto(float percentagemDesconto) {
		this.percentagemDesconto = percentagemDesconto;
	}



	
	
	
	
	
	
	
}
