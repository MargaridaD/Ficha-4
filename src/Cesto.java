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
	}
	
	//MÉTODOS
	//Um método que insere no cesto diferentes tipos de fruta.
	public void inserir(Fruta aFruta) {
		if (frutas.size() <= capacidade){  //É necessário fazer isto, porque quando atingimos a comprimento máximo, continua a ser possível adicionar elemntos ao array, ficando a array com um comprimento maior 
			frutas.add(aFruta);	
		}else {
			System.out.println("Não cabem mais itens no cesto!");
		}
		
	}
	
	//Um método que calcula o valor total da fruta no cesto.
	public double valorCesto() {
		double valorCesto=0;
		for(Fruta i:frutas) {
			valorCesto+=i.pagar();
		}
		return valorCesto;
	}
	
	//Um método que determina o número de frutos de um dado tipo existentes no cesto.
	public double numeroFrutaPorTipo(String aTipo) {
		
		double numeroFruta= 0;			
		for (Fruta i:frutas) {
			if(aTipo.equals(i.getClass().getSimpleName())) {
				numeroFruta++;
			}
		}
		return numeroFruta;
	}
	
	//Um método que determina o valor total gasto em frutos de um dado tipo
	public double valorPorTipo(String aTipo) {
		
		double valorTipo= 0;			
		for (Fruta i:frutas) {
			if(aTipo.equals(i.getClass().getSimpleName())) {
				valorTipo+= i.pagar();
			}
		}
		return valorTipo;
					
		}
		
	}




