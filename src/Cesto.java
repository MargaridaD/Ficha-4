import java.util.ArrayList;
import java.util.List;

public class Cesto {
	
	//ATRIBUTOS
	private int totalItens;
	private final int capacidade= 100;
	private List<Fruta> frutas;
	 
	
	//CONSTRUTOR
	public Cesto() {
		frutas = new ArrayList<Fruta>(capacidade);
		totalItens=0;
	}
	
	//MÉTODOS
	//Um método que insere no cesto diferentes tipos de fruta.
	public void inserirCesto(Fruta aFruta) {
		if (totalItens < capacidade){  //É necessário fazer isto, porque quando atingimos a comprimento máximo, continua a ser possível adicionar elemntos ao array, ficando a array com um comprimento maior 
			frutas.add(aFruta);	
			totalItens++;
		}else {
			System.out.println("Não cabem mais itens no cesto!");
		}
		
	}
	
	//c) Um método que calcula o valor total da fruta no cesto.
	public double valorCesto() {
		double valorCesto=0;
		for(Fruta i:frutas) {
			valorCesto+=i.pagar();
		}
		return valorCesto;
	}
	
	//d) Um método que determina o número de frutos de um dado tipo existentes no cesto.
	public int numeroFrutaPorTipo(String aTipoFruta) {
		
		int numeroTipoFruta= 0;			
		for (Fruta i:frutas) {
			if(aTipoFruta.equals(i.getClass().getSimpleName())) {
				numeroTipoFruta++;
			}
		}
		return numeroTipoFruta;
	}
	
	//e) Um método que determina o valor total gasto em frutos de um dado tipo
	public double valorPorTipo(String aTipoFruta) {
		
		double valorTipoFruta= 0;			
		for (Fruta i:frutas) {
			if(aTipoFruta.equals(i.getClass().getSimpleName())) {
				valorTipoFruta+= i.pagar();
			}
		}
		return valorTipoFruta;
					
		}

	
	//Getters e Setters
	public List<Fruta> getFrutas() {
		return frutas;
	}

	public void setFrutas(List<Fruta> frutas) {
		this.frutas = frutas;
	}
		
		
	}




