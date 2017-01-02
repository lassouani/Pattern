
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Création et utilisation du CompteBancaire cb1.
		CompteBancaire cb1 = new CompteBancaire(123456789);
		cb1.deposerArgent(100);
		cb1.retirerArgent(80);
		
		// Création et utilisation du CompteBancaire cb2.
		CompteBancaire cb2 = new CompteBancaire(987654321);
		cb2.retirerArgent(10);
		
		// Affichage des logs en console
		String s = Journalisation.getInstance().afficheLog();
		System.out.println(s);

	}

}
