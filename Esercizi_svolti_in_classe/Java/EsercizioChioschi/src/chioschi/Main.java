package chioschi;

public class Main {

	public static void main(String[] args) {
		Cliente client = new Cliente("Mimmo", 50);
		
		ChioscoBibite cBibita = new ChioscoBibite("Bibitello", "Pippo", 80);
		
		cBibita.registraCliente(client);
		
		cBibita.vendiBibita(2, client);
		
		cBibita.cancellaDebito(client);
		
		cBibita.eliminaCliente(client);
		
	}

}
