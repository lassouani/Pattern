
public class AfficheComplet implements Observateur {

	@Override
	// M�thode appel�e automatiquement lors d'un changement d'�tat du GPS.
	public void actualiser(Observable o) {
		// TODO Auto-generated method stub
		if (o instanceof Gps) {
			Gps g = (Gps) o;
			System.out.println("Position :"+g.getPosition()+ "Precision :"+g.getPrecision()+"/10");
			
		}

	}

}
