import java.util.ArrayList;

public class Gps implements Observable {

	
	private String position; // posistion du Gps
	private int precision; 
	private ArrayList tabObservateur; // Tableau d'observateurs.
	      
	// Constructeur.
	public Gps()
	{
	position="inconnue";
	precision=0;
	tabObservateur=new ArrayList();
	}
	
	
	
	
	@Override
	// Permet d'ajouter (abonner) un observateur � l'�coute du GPS.
	public void ajouterObservateur(Observateur o) {
		// TODO Auto-generated method stub
		tabObservateur.add(o);
		
	}
	@Override
	// Permet de supprimer (r�silier) un observateur �coutant le GPS
	public void supprimerObservateur(Observateur o) {
		// TODO Auto-generated method stub
		tabObservateur.remove(o);
		
	}
	@Override
	public void notifierObservateurs() {
		// TODO Auto-generated method stub
     
		for (int i = 0; i < tabObservateur.size(); i++) {
			Observateur o = (Observateur) tabObservateur.get(i);
			o.actualiser(this);
		}
	}
	
	// M�thode qui permet de mettre � jour de fa�on artificielle le GPS.
	// Dans un cas r�el, on utiliserait les valeurs retourn�es par les capteurs.
	public void setMesures(String position, int precision){
	
		 this.position=position;
		 this.precision=precision;
		 notifierObservateurs();
	}

	//M�thode qui permet de mettre � jour de fa�on artificielle le GPS.
   // Dans un cas r�el, on utiliserait les valeurs retourn�es par les capteurs.
	public String getPosition() {
		return position;
	}

    // Un accesseur en lecture pour pr�cision.
	public int getPrecision() {
		return precision;
	}


		
	
	
	

}
