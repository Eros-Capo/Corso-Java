public class Automobile {
	
	//Dichiarazione variabili
	private String colore;
	private double velocita;
	private String marca; // String marca = new String();
	private boolean antifurto;
	private String pneumatici;
	private double velocitaMax;
	private String nomeProprietario;
	private String targa="";
	
	//Dichiarazione costruttore
	public Automobile(String colore, double velocita, String marca, boolean antifurto, String pneumatici, double velocitaMax, String nomeProprietario, String targa) {
		this.colore=colore;
		this.velocita=velocita;
		this.marca=marca;
		this.antifurto=antifurto;
		this.pneumatici=pneumatici;
		this.velocitaMax=velocitaMax;
		this.nomeProprietario=nomeProprietario;
		this.targa=targa;
	}
	
	// Dichiarazione Metodi
	
	public double getVelocitaMax() {
		return velocitaMax;
	}
	
	public String getNomeProprietario(String targa) {
		String t = this.targa;
		
		if(targa.equals(t)) {
			return nomeProprietario;
		}else {
			return targa;
		}
	}
	
	public void stampaAutomobile() {
		if(targa.equals("")) {
			System.out.println("Caratteristiche: colore: " + colore + " antifurto: "+ antifurto + " marca: " + marca + " velocita\' massima: "+ velocitaMax);
		} else {
			System.out.println("L'auto possiede un proprietario");
		}
	}
}
