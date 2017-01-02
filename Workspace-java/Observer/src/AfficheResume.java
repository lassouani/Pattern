
public class AfficheResume implements Observateur {

	@Override
	// Méthode appelée automatiquement lors d'un changement d'état du GPS.
	public void actualiser(Observable o) {
		// TODO Auto-generated method stub
		
		if (o instanceof Gps) {
			Gps g = (Gps) o;
			System.out.println("Position :"+g.getPosition());
			
		}
		

	}

}
