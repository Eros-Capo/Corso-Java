package primoPacchetto;

public class Main {
	
	//FUNZIONE PRINCIPALE
	public static void main(String[] args) {
		
		//CREAZIONE OGGETTI
		Operaio operaioUno = new Operaio(0, "Mario", "Rossi", true);
		Operaio operaioDue = new Operaio(1, "Giorgio", "Rossi", false);
		Operaio operaioTre = new Operaio(2, "Giovanni", "Rossi", true);
		
		//STAMPA VARIABILE NOME DELL'OGGETTO
		System.out.println(operaioUno.nome);
	}

}
