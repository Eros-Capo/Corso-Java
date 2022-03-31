package principale;

public class Piatto {
   // DICHIARAZIONE ATTRIBUTI
   private String nomePiatto; //VARIABILE PRIVATA -> ACCESSIBILE SOLO ALL'INTERNO DELLA CLASSE IN CUI DICHIARATA
   public String codicePiatto; //VARIABILE PUBBLICA -> ACCESSIBILE ANCEH SE CHIAMATA DALL'ESTERNO DELLA CLASSE IN CUI DICHIARATA
   protected String ingredienti; //VARIABILE PROTETTA -> ACCESSIBILE SOLO ALL'INTERNO DELLA CLASSE IN CUI DICHIARATA ED ALLE CLASSI CHE LA ESTENDONO
   Double prezzo; // VARIABILE D'ISTANZA
	
	// DICHIARAZIONE COSTRUTTORE
	public Piatto () { };
	
	//DICHIARAZIONE METODI
	
	public void togliIngrediente(String ingrediente) {
		//codice per eliminare ingrediente scelto
		int numerIngredienti=0; // VARIABILE LOCALE
	}
	
	
}
