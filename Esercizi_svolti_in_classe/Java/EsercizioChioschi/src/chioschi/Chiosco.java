package chioschi;

import java.util.ArrayList;

public class Chiosco {
	// Dichiarazione Attributi
	private String nome;
	private String nomeResponsabile;
	ArrayList<Cliente> clienti = new ArrayList<Cliente>(0);
	
	//Dichiarazione costruttori
	public Chiosco() {}
	
	public Chiosco(String nome, String nomeResponsabile) {
		this.nome = nome;
		this.nomeResponsabile = nomeResponsabile;
	}
	
	// Dichiarazione Metodi
	public void registraCliente(Cliente c) {
		c.setIdCliente(clienti.size());
		clienti.add(c);
	}
	
	public void cancellaDebito(Cliente c) {
		if(clienti.contains(c)) {
			c.resetDebito();
		} else {
			System.out.println("Il cliente non risulta nel database!");
		}
	}
	
	public void eliminaCliente(Cliente c) {
		if(clienti.contains(c)) {
			clienti.remove(c);
		} else {
			System.out.println("Cliente non presente");
		}
	}
}
