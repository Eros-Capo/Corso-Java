import java.util.Scanner;

// Ricevere in ingresso dall'utente i numeri su cui operare
// Ricevere anche più di due addendi
// Permettere all'utente di scegliere che operazione eseguire
// Permettere all'utente di uscire in caso non voglia più svolgere operazioni

public class Main {

	public static void main(String[] args) {
		Calcolatore c = new Calcolatore();
		Scanner scan = new Scanner(System.in);
		
		int numeroInserito=0;
		int scelta=0;
		int exit=1;
		
		System.out.println("Benvenuto utente!");
		
		while(exit==1) {
			System.out.println("Inserisci 0 per la somma, 1 per la sottrazione, 2 per la moltiplicazione, 3 per la divisione, 4 per uscire");
			scelta = scan.nextInt();
			scan.nextLine();
			switch(scelta){
			case 0:
				System.out.println("Vecchio valore: " + c.getRisultato());
				System.out.println("Inserisci un valore da aggiungere alla somma!");
				numeroInserito = scan.nextInt();
				scan.nextLine();
				c.somma(numeroInserito);
				System.out.println("Nuovo risultato: " + c.getRisultato());
			break;
			case 1:
				System.out.println("Vecchio valore: " + c.getRisultato());
				System.out.println("Inserisci un valore da sottrarre al risultato!");
				numeroInserito = scan.nextInt();
				scan.nextLine();
				c.sottrazione(numeroInserito);
				System.out.println("Nuovo risultato: " + c.getRisultato());
			break;
			case 2:
				System.out.println("Vecchio valore: " + c.getRisultato());
				System.out.println("Inserisci un valore per il quale moltiplicare il risultato!");
				numeroInserito = scan.nextInt();
				scan.nextLine();
				c.moltiplicazione(numeroInserito);
				System.out.println("Nuovo risultato: " + c.getRisultato());
			break;
			case 3:
				System.out.println("Vecchio valore: " + c.getRisultato());
				System.out.println("Inserisci un valore per dividere il risultato!");
				numeroInserito = scan.nextInt();
				scan.nextLine();
				c.divisione(numeroInserito);
				System.out.println("Nuovo risultato: " + c.getRisultato());
			break;
			case 4:
				exit=0;
				return;
			}
		}
	
	}

}
