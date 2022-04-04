import java.util.Scanner;

/*Proviamo ora a scrivere un menu per il nostro programma,
*il menu dovrà salutare l'utente  e richiedere di inserire il valore
*0 per aggiungere un'auto oppure qualsiasi altro valore per inserire un motorino
*/

public class Main {

	public static void main(String[] args) {
		// Dichiarazione variabili utilizzate
		int scelta;
		Scanner scan = new Scanner(System.in);
		// Saluto all'utente
		System.out.println("Buongiorno utente!");
		
		System.out.println("Inserisca 0 per inserire un auto, oppure qualsiasi altro numero per inserire un motorino.");
		scelta = scan.nextInt();
		scan.nextLine(); // Consumo /n
		
		/*
		 * Sappiamo che quando scriviamo la funzione System.out.println(); 
		 * che stiamo parlando di Line, per Line si intende una stringa che
		 * contiene come valore finale il valore di ritorno a capo \n
		 * Esiste anche System.out.print();
		 * 
		 */
		
		if(scelta == 0) {
			// Dichiarazione variabili necessarie
			String colore;
			double velocita;
			String marca; // String marca = new String();
			boolean antifurto;
			String pneumatici;
			double velocitaMax;
			String nomeProprietario;
			String targa="";
			
			//Chiediamo all'utente di inserire i valori corrispondenti
			System.out.println("Inserire il colore");
			colore = scan.nextLine();
			System.out.println("Inserire la velocita");
			velocita = scan.nextDouble();
			System.out.println("Inserire la marca");
			scan.nextLine(); // Consumo /n
			marca = scan.nextLine();
			System.out.println("Inserire l'antifurto");
			antifurto = scan.nextBoolean();
			System.out.println("Inserire tipo pneumatici");
			scan.nextLine(); // Consumo /n
			pneumatici = scan.nextLine();
			System.out.println("Inserire Velocita massima");
			velocitaMax = scan.nextDouble();
			System.out.println("Inserire nome proprietario");
			scan.nextLine();
			nomeProprietario = scan.nextLine();
			System.out.println("Inserire targa");
			targa = scan.nextLine();
			
			// Construiamo l'oggetto con i valori inseriti dall'utente nelle variabili dichiarate in precedenza
			Automobile autoUno = new Automobile(colore, velocita, marca, antifurto, pneumatici, velocitaMax, nomeProprietario, targa);
			autoUno.stampaAutomobile();
		} else {
			
		}
	
	}

}
