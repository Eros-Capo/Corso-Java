package chioschi;

public class ChioscoGelati extends Chiosco {
	// Dichiarazione Attributi
	private int nGelatiDisponibili;
	private final double costoGelato = 1.00;
	
	// Dichiarazione Costruttori
	public ChioscoGelati() {}
	
	public ChioscoGelati(String nome, String nomeResponsabile, int nGelatiDisponibili) {
		super(nome, nomeResponsabile);
		this.nGelatiDisponibili = nGelatiDisponibili;
	}
	
	// Dichiarazione Metodi
	
	public void effettuaVendita(int nGelati, Cliente c) {
		if(super.clienti.contains(c) && nGelatiDisponibili>(0+nGelati)) {
			c.aumentaDebito(costoGelato*nGelati);
			nGelatiDisponibili-=nGelati;
		}else if(super.clienti.contains(c) && nGelatiDisponibili<nGelati){
			System.out.println("Gelati terminati!!");
		} else {
			System.out.println("Cliente non presente nel database!");
		}
	}
}
