package chioschi;

public class Cliente {
	// Dichiarazione Attributi
	private String nome;
	private int eta;
	private int idCliente;
	private double debitoTotale;
	
	//Dichiarazione costruttori
	public Cliente() {
		
	}
	
	public Cliente(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
		this.debitoTotale = 0;
	}
	
	// Dichiarazione Metodi
	
	public void setIdCliente(int id) {
		idCliente = id;
	}
	
	public void resetDebito() {
		debitoTotale = 0;
	}
	
	public void aumentaDebito(double ammontare) {
		debitoTotale += ammontare;
	}
}
