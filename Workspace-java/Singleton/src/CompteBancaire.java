
public class CompteBancaire {
	
	private int numero;// Num�ro du compte.
	private double solde;// Argent disponible sur le compte.
	
	// Constructeur d'un CompteBancaire � partir de son num�ro.
	public CompteBancaire(int numero){
		this.numero=numero;
		this.solde=0.0;
		}
	
	// M�thode qui permet de d�poser de l'argent sur le compte.
	public void deposerArgent(double depot) {
		if (depot >0.0) {
			solde+=depot;// On ajoute la somme d�pos�e au solde.
			Journalisation.getInstance().ajouterLog("D�p�t de "+depot+"� sur le compte "+numero+".");
		} else {
			Journalisation.getInstance().ajouterLog("/!\\ D�p�t d'une valeur n�gative impossible ("+numero+").");
		}
		
	}
	
	// M�thode qui permet de retirer de l'argent sur le compte.
	public void retirerArgent(double retrait) {
		
		if (retrait > 0.0) {
			
			if (solde >= retrait) {
				solde-=retrait;// On retranche la somme retir�e au solde.
				Journalisation.getInstance().ajouterLog("Retrait de "+retrait+"� sur le compte "+numero+".");
				
			} else {
				Journalisation.getInstance().ajouterLog("/!\\ La banque n'autorise pas de d�couvert ("+numero+").");
			}
			
		} else {
			Journalisation.getInstance().ajouterLog("/!\\ Rerait d'une valeur n�gative impossible ("+numero+").");
		}
	}

}
