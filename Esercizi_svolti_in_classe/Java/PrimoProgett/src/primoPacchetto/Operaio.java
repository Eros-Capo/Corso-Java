package primoPacchetto;

public class Operaio {
	// Dichiaro le variabili
	private int idOperaio;
	public String nome;
	private String cognome;
	private boolean patente;
	
	//COSTRUTTORE 
	public Operaio(int id, String nome, String cognome, boolean patente) {
		this.idOperaio = id;
		this.nome = nome;
		this.cognome = cognome;
		this.patente = patente;
	}
	
	// METODO PER VISUALIZZARE
	public void visualizzaDati(int id){
		System.out.println(this.idOperaio +" "+ this.nome +" "+ this.cognome +" "+ this.patente);
	}
}
