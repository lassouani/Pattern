
// Classe usine qui repr�sente un b�timent capable de construire des unit�s.
public class Usine {
	private SimpleFabrique simpleFabrique;// Attribut contenant la fabrique
											// simple.

	// Le constructeur permet de s�lectionner la fabrique � utiliser.
	public Usine() {
		this.simpleFabrique = new SimpleFabrique();
	}

	// M�thode qui permet de construire l'ensemble des unit�s.
	public Unite formerUnite(String type) {
		Unite unite = this.simpleFabrique.creerUnite(type);
		unite.consommerRessource();
		unite.equiper();
		return unite;
	}
}