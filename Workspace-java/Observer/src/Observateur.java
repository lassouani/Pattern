/**
 * 
 */

/**
 * @author asus-pc
 *
 */
public interface Observateur {
	
	// M�thode appel�e automatiquement lorsque l'�tat (position ou pr�cision) du GPS change.
	public void actualiser(Observable o);

}
