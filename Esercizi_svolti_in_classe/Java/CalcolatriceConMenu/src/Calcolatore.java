public class Calcolatore {
	private double risultato;
	
	public Calcolatore() {}
	
	public void somma(double numero) {
		risultato += numero;
	}
	
	public void sottrazione(double numero) {
		risultato -= numero;
	}
	
	public void moltiplicazione(double numero) {
		risultato *= numero;
	}
	
	public void divisione(double numero) {
		risultato /= numero ;
	}
	
	public double getRisultato() {
		return risultato;
	}
}
