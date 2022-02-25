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
	
	//M�TODOS
	//Um m�todo que insere no cesto diferentes tipos de fruta.
	public void inserirCesto(Fruta aFruta) {
		if (totalItens < capacidade){  //� necess�rio fazer isto, porque quando atingimos a comprimento m�ximo, continua a ser poss�vel adicionar elemntos ao array, ficando a array com um comprimento maior 
			frutas.add(aFruta);	
			totalItens++;
		}else {
			System.out.println("N�o cabem mais itens no cesto!");
		}
		
	}
	
	//c) Um m�todo que calcula o valor total da fruta no cesto.
	public double valorCesto() {
		double valorCesto=0;
		for(Fruta i:frutas) {
			valorCesto+=i.pagar();
		}
		return valorCesto;
	}
	
	//d) Um m�todo que determina o n�mero de frutos de um dado tipo existentes no cesto.
	public int numeroFrutaPorTipo(String aTipoFruta) {
		
		int numeroTipoFruta= 0;			
		for (Fruta i:frutas) {
			if(aTipoFruta.equals(i.getClass().getSimpleName())) {
				numeroTipoFruta++;
			}
		}
		return numeroTipoFruta;
	}
	
	//e) Um m�todo que determina o valor total gasto em frutos de um dado tipo
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




