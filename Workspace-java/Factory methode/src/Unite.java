import java.util.ArrayList;

// Classe abstraite dont toutes les unit�s du jeu h�riteront.
public abstract class Unite {

	protected String nom;// Nom de l'unit�.
	protected int coutConstruction;// Co�t de construction de l'unit�.
	protected int precisionAttaque;// Pr�cision de l'attaque de l'unit�.
	protected int esquiveDefense;// Facult� d'esquiver une attaque de l'unit�.
	protected ArrayList equipements;// Tableau des �quipements de l'unit�.

	// M�thode qui consomme les ressources pour cr�er une unit�.
	public void consommerRessource() {

		System.out.println("Consomme " + this.coutConstruction + " ressources pour la cr�ation de l'unit�.");
	}

	// M�thode abstraite qui permet d'�quiper l'unit�.
	public abstract void equiper();

	// M�thode g�n�rique pour l'affichage de l'unit�.
	public String toString() {
		String str = "Nom : " + this.nom + "\n";
		str += "Co�t de construction : " + this.coutConstruction + "\n";
		str += "Pr�cision d'attaque : " + this.precisionAttaque + "\n";
		str += "Esquive en d�fense : " + this.esquiveDefense + "\n";
		str += "Equipements : ";
		for (int i = 0; i < this.equipements.size(); i++) {
			str += this.equipements.get(i) + " ";
		}
		return str;
	}
}
