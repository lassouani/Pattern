
public abstract class DecorateurIngredient extends Dessert {
	
	protected Dessert dessert;// Dessert sur leuquel on applique l'ingr�dient.
	
	// On oblige les ingr�dients � impl�menter la m�thode getLibelle().
	public abstract String getLibelle();
	
	// On oblige les ingr�dients � impl�menter la m�thode getPrix().
	public abstract double getPrix();

}
