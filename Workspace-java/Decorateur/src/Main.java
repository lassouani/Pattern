

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cr�ation et affichage d'une gaufre au chocolat.
	     Dessert d1 = new Gaufre();
	     d1 = new Chocolat(d1);
	     System.out.println(d1);
	     
	     // Cr�ation et affichage d'une cr�pe au chocolat et chantilly.
	     Dessert d2 = new Crepe();
	     d2 = new Chocolat(d2);
	     d2 = new Chantilly(d2);
	     System.out.println(d2);

	}

}
