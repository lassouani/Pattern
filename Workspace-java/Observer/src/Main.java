
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cr�ation de l'objet Gps observable.
		Gps g = new Gps();
		// Cr�ation de deux observeurs AfficheResume et AfficheComplet
		AfficheResume ar = new AfficheResume();
		AfficheComplet ac = new AfficheComplet();
		// On ajoute AfficheResume comme observeur de Gps.
		g.ajouterObservateur(ar);
		
		// On simule l'arriv�e de nouvelles valeurs via des capteurs.
		g.setMesures("N 39�59�993 / W 123�00�000", 4);
		// On ajoute AfficheComplet comme observeur de Gps.
		g.ajouterObservateur(ac);
		// Nouvelle simulation d'arriv�e de nouvelles valeurs via des capteurs.
		g.setMesures("N 37�48�898 / W 124�12�011", 5);

	}

}
