public class Motorino {
	
	// Dichiarazione attributi
	private String colore;
	private float velocita;
	private String marca;
	private boolean antifurto;
	
	// Costruttore
	public Motorino(String colore, String marca, float velocita) {
		this.colore=colore;
		this.marca=marca;
		this.velocita=velocita;
	}
	
	// Dichiarazione metodi
	public boolean getAntifurto() {
		return antifurto;
	}
	
	public void controlloVelocita() {
		System.out.println(velocita);
	}
	
	public void accellera(float accelerazione) {
		velocita+=accelerazione;
		System.out.println(velocita);
	}
	
	public void setColore(String colore) {
		this.colore=colore;
	}
	
	public String getColore() {
		return colore;
	}
}