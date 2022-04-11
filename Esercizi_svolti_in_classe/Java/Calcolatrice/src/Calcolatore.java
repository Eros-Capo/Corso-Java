public class Calcolatore {
	
	private double risultato;
	
	public Calcolatore() {}
	
	public void somma(double nUno, double nDue) {
		risultato = nUno + nDue;
	}
	
	public void sottrazione(double nUno, double nDue) {
		risultato = nUno - nDue;
	}
	
	public void moltiplicazione(double nUno, double nDue) {
		risultato = nUno * nDue;
	}
	
	public void divisione(double nUno, double nDue) {
		risultato = nUno / nDue;
	}
	
	public double getRisultato() {
		return risultato;
	}
	
}
