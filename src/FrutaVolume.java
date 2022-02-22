
public class FrutaVolume extends Fruta {
	private double volume;

	public FrutaVolume (String aNome, double aPrecoBase, double aVolume) {
		super(aNome, aPrecoBase);
		volume= aVolume;
	}

	public double pagar() {
		return volume*getPrecoBase();
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
}
