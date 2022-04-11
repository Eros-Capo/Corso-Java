// Ricevere in ingresso dall'utente i numeri su cui operare
// Ricevere anche più di due addendi
// Permettre all'utente di scegliere che operazione eseguire
// Permettere all'utente di uscire in caso non voglia più svolgere operazioni

public class Main {

	public static void main(String[] args) {

		Calcolatore c = new Calcolatore();

		c.somma(10, 25);
		System.out.println(c.getRisultato());
	
		c.sottrazione(20, 12);
		System.out.println(c.getRisultato());
		
		c.moltiplicazione(10, 9);
		System.out.println(c.getRisultato());
		
		c.divisione(4, 2);
		System.out.println(c.getRisultato());
	}

}
