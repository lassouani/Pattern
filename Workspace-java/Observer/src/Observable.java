/**
 * 
 */

/**
 * @author asus-pc
 *
 */
public interface Observable {
	
	// M�thode permettant d'ajouter (abonner) un observateur.
	public void ajouterObservateur(Observateur o);
	
	// M�thode permettant de supprimer (r�silier) un observateur.
	public void supprimerObservateur(Observateur o);
	
	// M�thode qui permet d'avertir tous les observateurs lors d'un changement d'�tat.
	public void notifierObservateurs();

}
