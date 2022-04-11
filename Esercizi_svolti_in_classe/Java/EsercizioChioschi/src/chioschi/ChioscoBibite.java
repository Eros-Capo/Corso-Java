package chioschi;

public class ChioscoBibite extends Chiosco{
	// Dichiarazione Attributi
	private int nBibiteDisponibili;
	private boolean happyHour = false;
	private double costoBibita = 2.00;
	
	// Dichiarazione Costruttori
	public ChioscoBibite() {}
		
	public ChioscoBibite(String nome, String nomeResponsabile, int nBibiteDisponibili) {
		super(nome, nomeResponsabile);
		this.nBibiteDisponibili = nBibiteDisponibili;
	}
	
	// Dichiarazione Metodi
	
	public void inizioHappyHour() {
		happyHour = true;
		costoBibita-=1.00;
	}
	
	public void termineHappyHour() {
		happyHour = false;
		costoBibita+=1.00;
	}
	
	public void vendiBibita(int nBibite, Cliente c) {
		if(super.clienti.contains(c) && nBibiteDisponibili>nBibite) {
			c.aumentaDebito(costoBibita*nBibite);
			nBibiteDisponibili-=nBibite;
			System.out.println("Abbiamo venduto "+ nBibite +"al cliente: "+ c.getNome() + " !");
			System.out.println("Ci rimangono "+ nBibiteDisponibili);
		}else if(super.clienti.contains(c) && nBibiteDisponibili<=nBibite){
			System.out.println("Bibite terminate!!");
		}else {
			System.out.println("Cliente non presente nel database!");
		}
	}
	
}
